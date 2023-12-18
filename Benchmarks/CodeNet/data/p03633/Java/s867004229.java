import java.util.Scanner;

public class Main {

public static void main(String[] args) {

 Scanner in = new Scanner(System.in);
 int N = in.nextInt();
 long input = 0;
 long n2 = 0;
 long n21 = 0;
 long n2b = 1000000000000000000L;
 long n21b = 1000000000000000000L;

 for(int cnt = 0; cnt < N; cnt++){
	 input = in.nextLong();
	 if(input % 2 == 0){
		 if(input > n2){
		     n2 = input;
		 }
		 else if(input < n2b){
			 n2b = input;
		 }
	 }
	 else{
		 if(input > n21){
			 n21 = input;
		 }
		 else if(input < n21b){
			 n21b = input;
		 }
	 }
 }
 if((n2 == 0)&&(n2b == 1000000000000000000L)){
	 System.out.println(lcm(n21,n21b));
 }
 else if((n21 == 0)&&(n21b == 1000000000000000000L)){
	 System.out.println(lcm(n2,n2b));
 }
 else{
	 System.out.println(lcm(n2,n21));
 }


 in.close();
}

private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}

private static long lcm(long m, long n) {
    return m * n / gcd(m, n);
}

}
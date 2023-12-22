import java.util.Scanner;
class Main{
	public static int gcd(int m, int n) {
		if(n ==0){
			return m;
		}else{
			return gcd(n,m%n);
		}
	}
	public static long lcm(int m, int n){
		return (m / gcd(m, n)) * n; 
	}
    public static void main(String[] a){
    	
    	Scanner scan = new Scanner(System.in);
    	while (scan.hasNext()){ 
    	int n = 0;
    	int m = 0;
    	m = scan.nextInt();
    	n = scan.nextInt();
    	System.out.print(gcd(m,n) + " ");
    	System.out.println(lcm(m,n));
    	
    	}
 }
}
import java.util.Scanner;
public class Main{
 
  static int gcd (int C, int D) {
	int temp;
	while((temp = a%b)!=0) {
		a = b;
		b = temp;
	}
	return b;
}
  
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   long A = sc.nextLong-1();
   long B = sc.nextLong();
   int C = sc.nextInt();
   int D = sc.nextInt();
   
   int gcd_cd = 0;
   if(C >=D) gcd_cd = gcd(C,D);
   else gcd_cd = gcd(D,C);
   
   int sum_B = B/C - B/D + B/gcd_cd
   int sum_A = A/C - A/D + A/gcd_cd
   
     
   System.out.println(sum_B-sum_A);
 }
}
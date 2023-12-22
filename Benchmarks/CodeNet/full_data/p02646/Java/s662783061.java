import java.util.Scanner;
 
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      
      long a = sc.nextLong();
      long b = sc.nextLong();
      long c = sc.nextLong();
      long d = sc.nextLong();
      long n = sc.nextLong();
      
      for (long i = 0; i < n; i++){
        a += b;
        c += d;
      }
      if (c >= a){
		System.out.println("YES");
      }else{
        System.out.println("NO");
      }
   }
}
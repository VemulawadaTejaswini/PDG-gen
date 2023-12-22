import java.util.Scanner;
 
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      
      float a = sc.nextFloat();
      long b = sc.nextInt();
      float c = sc.nextFloat();
      long d = sc.nextInt();
      long n = sc.nextInt();
      
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
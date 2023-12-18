import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
      int d1 = 0;
      int a1 = 0;
      for(int i = 0;i<k;i++){
         int d = sc.nextInt();
         if(d1<d){
            d1 = d;
         }
         for(int j = 0;j<2;j++){
            int a = sc.nextInt();
         }
      }
      System.out.println(n-d1);
   }
}
  
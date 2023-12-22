import java.util.*;

public class Main{
		public static void main(String[] args){
        Scanner sc =new Scanner(System.in);	
          int n = sc.nextInt();
          long c=0;
          long[] a = new long[100];
          for(int i=1;i<=n;i++){
          	a[i] = sc.nextInt();
          }
          for(int i=1;i<=n;i++){
          	for(int j=i+1;j<=n;j++){
              	c = c + a[i]*a[j];
            }
          }
          if(c>1000000000)
          	System.out.println(c%1000000007);
          else
            System.out.println(c);
        }
}
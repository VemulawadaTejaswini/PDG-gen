import java.util.*;

public class Main{
		public static void main(String[] args){
        Scanner sc =new Scanner(System.in);	
          int n = sc.nextInt();
          int c;
          long[] a = new long[100];
          for(int i=1;i<=n;i++){
          	for(int j=i+1;j<n;j++){
              	c = c + i*j;
           		System.out.println(c);
            }
          }
        }
}
import java.util.*;
public class Main {
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] a=new int[n];
      for(int i=0;i<n;i++){
      	a[i]=sc.nextInt();
      }
      int q=sc.nextInt();
      int b;
      int c;
      int sum=0;
      for(int i=0;i<q;i++){
        b=sc.nextInt();
        c=sc.nextInt();
      	for(int j=0;j<n;j++){
        	if(a[j]==b){
            	a[j]=c;
            }
          	sum+=a[j];
        }
        System.out.println(sum);
        sum=0;
      }
	}
}
import java.util.*;
public class Main{
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int w[]=new int[n];
		 boolean f=true;
		 for (int i = 0; i < n; i++) {
				w[i]=sc.nextInt();
				
				}
		 int temp=0;
		 for(int i=0;i<n;i++) {
			  for(int j=0;j<n;j++) {
				  if(w[i]<w[j]) {
				  temp=w[i];
				  w[i]=w[j];
				  w[j]=temp;
			  }
		 }
		 }
		 int ans=0;
		 for(int i=0;i<n;i++) {
			while(w[i]%2==0) {
				w[i]=w[i]/2;
				ans++;
				
			}
		 }
		System.out.println(ans);
		 
		 }
		 
	 }
	
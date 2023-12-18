import java.util.Scanner;

public class Main {
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			
			int n=sc.nextInt();
			int[] a=new int [n-1];
			int[] b=new int [n-1];
			
			for(int i=0;i<n-1;i++){
				a[i]=sc.nextInt();
				b[i]=sc.nextInt();
			}
			
			int[] ans=new int [n];
			
			int count=1;
			int num=1;
			
			ans[1]=1;
			
			for(int i=1;i<n-1;i++){
				if(a[i]==b[i-1] || a[i]==a[i-1]){
					num++;
				}else{
					num=1;
				}
				ans[i+1]=num;
				if(num>count)count=num;
			}
			
			ans[0]=count;
			
			for(int i=0;i<n;i++){
				System.out.println(ans[i]);
			}
			
		}

}

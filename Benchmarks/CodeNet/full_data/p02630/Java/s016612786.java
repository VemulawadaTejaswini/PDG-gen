import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		 a[i]=Integer.parseInt(br.readLine());   
		}
		int k=Integer.parseInt(br.readLine());
		int b[]=new int[k];
		int c[]=new int[k];
		
		for(int i=0;i<k;i++){
		 b[i]=Integer.parseInt(br.readLine());
		 c[i]=Integer.parseInt(br.readLine());
		 int sum=0;
		for(int j=0;j<n;j++){
		   if(a[j]==b[i]){
		    a[j]=c[i];   
		   }
		   sum=sum+a[j];
		}  
		System.out.println(sum);
	 }	
   }	
}
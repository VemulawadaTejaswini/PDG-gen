import java.util.Scanner;


public class Main {


  public static void main(String[] args) {

	  Scanner sc=new Scanner(System.in);
	 int n=Integer.parseInt(sc.next());
	 int a[]=new int[n+1];
	 int min=0,max=0;
	 long sum=0;

	 for(int i=0;i<n;i++){
		 a[i]=Integer.parseInt(sc.next());
		 if(i==0){
			 min=a[i];
			 max=a[i];
			
		 }
		
		 sum=sum+a[i];
		 min=Math.min(min, a[i]);
		 max=Math.max(a[i], max);
		 
		 
	 }

	 System.out.println(min + " " + max + " "+ sum);

  }
}
import java.util.Scanner;


public class Main {


  public static void main(String[] args) {

	  Scanner sc=new Scanner(System.in);
	 int n=Integer.parseInt(sc.next());
	 int a[]=new int[n+1];
	 int min=0,max=0,sum=0;

	 for(int i=0;i<n;i++){
		 a[i]=Integer.parseInt(sc.next());
		 if(i==0){
			 min=a[i];
			 max=a[i];
			 sum=a[i];
		 }
		 
		 else{
		 min=Math.min(min, a[i]);
		 max=Math.max(a[i], max);
		 sum=sum+a[i];
		 }
	 }

	 System.out.println(min + " " + max + " "+ sum);

  }
}
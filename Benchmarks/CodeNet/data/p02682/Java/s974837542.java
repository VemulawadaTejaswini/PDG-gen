import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
	  long a =scn.nextLong();
	   long b =scn.nextLong();
	   long c =scn.nextLong();
	   long k =scn.nextLong();
	   
	   if(a>=k){
		   System.out.println(k);
		   return ;
	   }
	   long ans=0;
	   ans+=a;
	   k-=a;
	   if(b>=k){
		   System.out.println(ans);
		   return;
	   }
	   k-=b;
	   ans-=(k);
	   System.out.println(ans);
	   
	   

	}

}
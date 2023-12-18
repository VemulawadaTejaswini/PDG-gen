import java.util.*;

public class Main{

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 int c=sc.nextInt();
	 int x=sc.nextInt();
	 int count=0;
	 int xx=x;
	 int cc=0;



	 for(int i=0;i<=x/500;i++){
		 for(int k=0;k<=x/100;k++){
			 xx=x;
			 xx-=500*i+100*k;
			 if(xx>=0){
				 cc=xx/50;
					if(i<=a && k<=b && cc<=c){
						count++;
					}
			 }
		 }
	 }

	 System.out.println(count);




	}
}

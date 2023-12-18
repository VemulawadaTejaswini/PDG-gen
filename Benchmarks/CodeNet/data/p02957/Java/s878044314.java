import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,n1=0,n2=0,p1=0,p2=0,i=0,j=0,k=1;
	Scanner scan=new Scanner(System.in);
	while (k!=0) {
		k++;
	 a=scan.nextInt();
	 b=scan.nextInt();
    i=b-a;
    if(i%2==0) {
    k=b-i/2;
    System.out.println(k);
   }
   else 
   System.out.println("IMPOSSIBLE");
	
	   }
	
	 }
}

 
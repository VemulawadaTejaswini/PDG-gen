import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,i=0,k=1;
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

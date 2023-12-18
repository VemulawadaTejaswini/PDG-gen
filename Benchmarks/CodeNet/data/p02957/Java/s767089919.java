import java.util.Scanner;
public class Main {
	static int a,b;
	static int getK(int a,int b) {  
		int i,k=0;
		  i=b-a;
		    k=b-i/2;
		  return k ;
  } 

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
    System.out.println(getK(a,b));
   }
   else 
   System.out.println("IMPOSSIBLE");
	
	   }
	
	 }
}

 


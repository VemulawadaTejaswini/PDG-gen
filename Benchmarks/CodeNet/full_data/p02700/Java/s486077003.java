/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		

	int k =0;
	 while(a>0 && c>0){
	     if(k%2==0){
	         c-=b;
	         k++;
	         
	     }else{
	         a-=c;
	         k++;
	     }
	 }
if(a>=0){
    System.out.println("Yes");
}else{
     System.out.println("No");
}
	}
}

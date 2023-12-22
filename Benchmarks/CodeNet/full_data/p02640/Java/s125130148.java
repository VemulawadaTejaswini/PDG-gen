import java.util.Scanner;

public class Main{
  public static void main(String[]args){
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int l=sc.nextInt();
    
    int lwBound=2*n;
    int upBound=4*n;
    
    if(l>=lwBound && l<=upBound) {
    	if(l%2==0 ) {
    		System.out.println("Yes");
    	}
    	else
    		System.out.println("No");
    	
    }
    else
    	System.out.println("No");
    
  }
}

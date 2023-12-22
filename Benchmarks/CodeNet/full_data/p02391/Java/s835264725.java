import java.util.Scanner;
public class A{

	public static void main(String[] args) {
        int a;
        a=new Scanner(System.in).nextInt();
        int b;
        b=new Scanner(System.in).nextInt();
        
        if(a<b)
        	System.out.print(a+"<"+b);
        
        else if(a>b)
            System.out.print(b+"<"+a);
        
        else 
            System.out.print(a+"="+b);
        
        
	}
}
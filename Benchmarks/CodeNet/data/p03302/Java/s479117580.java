import java.util.*;
public class Program {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	    int b = sc.nextInt();
		int c=0;
		if((a+b)==15)
			c=1;
		else if((a*b)==15)
			c=2;
		else
			c=3;
		
		switch(c){
			case 1:
					System.out.print("+");	
					break;
			case 2:
					System.out.print("*");	
					break;
			case 3:
					System.out.print("x");	
					break;
		}
	}
}
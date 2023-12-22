import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	int n = kbd.nextInt();
	while(n>0){
	    int a = kbd.nextInt();
	    int b = kbd.nextInt();
	    int c = kbd.nextInt();
	    
	    a = a*a;
	    b = b*b;
	    c = c*c;
	    
	    if(a==b+c || b==a+c || c==a+b)
		System.out.println("YES");
	    else
		System.out.println("NO");
	    n--;
	}
    }
}

	    
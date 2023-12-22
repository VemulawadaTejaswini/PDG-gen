import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int a, b, c;
    void run(){
	int n = sc.nextInt();
	while(n-- > 0){
	    a = sc.nextInt();
	    b = sc.nextInt();
	    c = sc.nextInt();
	    a = a*a;
	    b = b*b;
	    c = c*c;
	    if(a==(b+c) || b==(a+c) || c==(a+b))
		System.out.println("YES");
	    else System.out.println("NO");
	}
    }
}
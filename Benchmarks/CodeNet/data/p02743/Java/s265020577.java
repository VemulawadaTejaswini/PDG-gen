import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
        int c = sc.nextInt();
        double d = Math.sqrt(a*b);
        if(a+b+2*d < c){System.out.println("Yes");}
        else{System.out.println("No");}
	}
}

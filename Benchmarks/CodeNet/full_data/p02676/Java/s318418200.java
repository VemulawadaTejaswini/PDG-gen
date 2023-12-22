import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		String s = sc.next();
        if(s.length()<=a){System.out.println(s);}
        else{System.out.println(s.substring(0,a)+"...");}
		
	}
}

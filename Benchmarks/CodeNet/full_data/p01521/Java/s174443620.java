import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			char[] a = sc.next().toCharArray();
			if(a[0]=='x' && a[a.length-1]=='x') System.out.println('x');
			else System.out.println('o');
		}	
	}	
}
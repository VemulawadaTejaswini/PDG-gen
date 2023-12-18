import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] a = sc.nextline();
		for(String i : a){
			if(",".equals(a)) a[i] = " ";
			System.out.print(a);
		}
	}
}
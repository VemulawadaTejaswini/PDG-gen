import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int v = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int t = Integer.parseInt(sc.next());
		boolean flg = false;
		for(int i=0; i<t; i++){
			a += v;
			b += w;
			if(a >= b){
				flg = true;
				break;
			}
		}
		System.out.println(flg ? "YES" : "NO");
	}
}

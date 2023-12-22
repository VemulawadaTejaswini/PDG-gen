
import java.util.*;
//import java.util.stream.Collectors;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int d = Integer.parseInt(sc.next());
		int count = 0;
		for(int i=0; i<n; i++){
			long x = Integer.parseInt(sc.next());
			long y = Integer.parseInt(sc.next());
			if(Math.sqrt(x * x + y * y) <= d){
				count++;
			}
		}
		System.out.println(count);
	}
}

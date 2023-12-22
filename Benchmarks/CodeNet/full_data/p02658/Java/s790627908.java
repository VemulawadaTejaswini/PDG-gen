import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		long a = 1;
		for(int i = 0; i < size; i++){
			a *= sc.nextLong();
			String str = "" + a;
			if(str.length() > 18){
				if(str.equals("1000000000000000000")) continue;
				a = -1;
			}
		}
		System.out.println(a);
	}
}
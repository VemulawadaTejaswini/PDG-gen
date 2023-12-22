import java.util.*;
public class Main{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int k = Integer.parseInt(scan.next());
		String s = scan.next();
		if(s.length() <= k){
			System.out.print(s);
		}else{
			for(int i = 0;i < k; ++i){
				System.out.print(s.charAt(i));
			}
			System.out.print("...");
		}
	}
}


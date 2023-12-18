import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		String s = scan.next();

		boolean[] ans = new boolean[n];
		int count = 0;
		int rank = 0;
		for(int i = 0;i < n; ++i){
			if(count >= a+b)break;
			if(s.charAt(i) == 'a'){
				ans[i] = true;
				++count;
			}else if(s.charAt(i) == 'b' && rank < b ){
				++rank;
				++count;
				ans[i] = true;
			}
		}		

		for(boolean i: ans){
			System.out.println(i?"Yes":"No");
		}

	}
}


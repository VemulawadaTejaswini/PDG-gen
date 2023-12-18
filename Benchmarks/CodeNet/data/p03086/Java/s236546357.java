import java.util.HashSet;
import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String ss = sc.next();
		HashSet<Character> set = new HashSet<Character>();
		set.add('A');
		set.add('C');
		set.add('G');
		set.add('T');

		
		int ans = 0;
		int left = 0;
		int right = 1;
		
		while(left <= ss.length()){
			while(!set.contains(ss.charAt(left))){		//左端を動かす
				left++;
				if(left == ss.length()){
					break;
				}

			}

			if(left == ss.length()){
				break;
			}
			right = left;
			while(set.contains(ss.charAt(right))){
				right++;
				if(right == ss.length()){
					break;
				}
			}
			ans = Math.max(ans, right-left);
			
			left = right;
			if(left == ss.length()){
				break;
			}
			
		}
		
		System.out.print(ans);

	}


}


class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}



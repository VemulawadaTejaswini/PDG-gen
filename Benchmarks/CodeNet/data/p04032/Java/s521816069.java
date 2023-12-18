import java.util.Scanner;

/**
 * https://abc043.contest.atcoder.jp/tasks/arc059_b
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		char[] chars = s.toCharArray();
		int left = -1;
		int right = -1;
		for(int l=1; l<=3; l++){
			for(int i=0; i<chars.length-l; i++){
				int[] tmp = new int[26];
				for(int k=0; k<=l; k++){
					tmp[chars[i+k]-'a']++;
				}
				for(int t: tmp){
					if(t*2>l+1){
						left = i+1;
						right = i+l+1;
						break;
					}
				}
				if(left>=0) break;
			}
			if(left>=0) break;
		}
		
		System.out.println(left+" "+right);
		
	}

}

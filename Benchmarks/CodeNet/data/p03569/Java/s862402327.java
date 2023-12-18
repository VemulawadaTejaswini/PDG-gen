import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		sc.close();
		
		ArrayList<Integer> sa = new ArrayList<Integer>();
		for(int i=0; i<s.length(); i++){
			sa.add(c[i] - 97);
		}
		
		int epos = sa.size() -1;
		int ans = 0;
		
		for(int i=0; i<epos; i++){
			int i1 = sa.get(i);
			int i2 = sa.get(epos);
			if(i1 != i2){
				if(i1 != 23 && i2 != 23){
					System.out.println("-1");
					return;
				}else if(i1 == 23){
					sa.add(epos+1, 23);
					ans++;
					epos++;
				}else if(i2 == 23){
					sa.add(i, 23);
					ans++;
					epos++;
				}
			}
			epos--;
			if(ans > 100001){
				System.out.println("-1");
				return;
			}
		}
		
		System.out.println(ans);
		
//		int[] num = new int[26];
//		for(int i=0; i<s.length(); i++){
//			num[c[i]-97]++;
//		}
//		
//		int knum = 0;
//		int kpos;
//		for(int i=0; i<26; i++){
//			if(c[i] % 2 != 0){
//				knum++;
//				kpos = i;
//			}
//		}
//		
//		if(knum >= 2){
//			System.out.println("-1");
//			return;
//		}
//		
//		if(knum == 1){
//			
//		}
	}
}
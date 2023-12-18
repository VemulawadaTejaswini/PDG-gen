
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());//int型
		int q = Integer.parseInt(sc.next());//int型
		String sline = sc.next();
		char[] s = new char[n];
		char[] t = new char[q];
 		char[] d = new char[q];
 		int[] m = new int[n];
 		for(int i=0;i<n; i++){
 			m[i]=1;
 		}
		HashMap<Character, ArrayList<Integer>> charMap = new HashMap<>();
		char L00='A';
		for(int L01 = 0; L01 <= ('Z' - 'A'); L01++){
			charMap.put(L00++, new ArrayList<Integer>());
		}
		// 文字列読み込み,インデックス整理
		for (int i=0; i<n; i++){
			s[i] = sline.charAt(i);	
			charMap.get(s[i]).add(i);
		}
		
		for(int i=0; i<q; i++){
			t[i] = sc.next().charAt(0);
			d[i] = sc.next().charAt(0);
		}
		sc.close();
		
		for(int i=0; i<q; i++){
			//対象のマスを取得
			ArrayList<Integer> al = charMap.get(t[i]);
			if(d[i]=='L'){
				for(int j : al){
					if(j == 0){
						m[j] = 0;
					} else {
						m[j-1] += m[j];
						m[j] = 0;
					}	
				}	
			} else if(d[i]=='R'){
				Collections.reverse(al);
				for(int j: al){
					if(j == n-1){
						m[j] = 0;
					} else {
						m[j+1] += m[j];
						m[j] = 0;
					}
				}
				Collections.reverse(al);
			}
		}
		int ans = 0;
		for(int i=0;i<n;i++){
			ans += m[i];
		}
		System.out.println(ans);
	}
}

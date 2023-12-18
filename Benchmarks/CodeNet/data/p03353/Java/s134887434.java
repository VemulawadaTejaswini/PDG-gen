import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int K = sc.nextInt();
		ArrayList<String> ans = new ArrayList();
		int cnt = 0;
		for(int i=0;i<s.length();i++) {
			for(int k=i+1;k<=s.length() && k-i<=K;k++) {
				String temp = new String((s.substring(i,k)));
				if(cnt<K && !ans.contains(temp)) {
					ans.add(new String(temp));
					cnt++;
				}
				if(cnt==K) {
					Collections.sort(ans);
					cnt++;
				}
				else if(cnt > K && !ans.contains(temp)) {
					if(ans.get(K-1).compareTo(temp)<0)
						break;
					else {
						for(int j=K-1;j>=0;j--) {
							if(ans.get(j).compareTo(temp)>0) {
								continue;
							}else{
								ans.add(j+1,temp);
								ans.remove(ans.size()-1);
								break;
							}
						}
					}
				}
			}
		}
		System.out.println(ans.get(K-1));
	}
}

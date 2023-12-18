import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> stateList = new ArrayList<String>();

		int k = sc.nextInt();
		String s = sc.next();
		int len = s.length();
		String sub[] = new String[len*k+1];
		int cnt=0;
		
		for(int i=0; i<len; i++) {
			for(int j=0; j<k; j++) {
				if(i+j>len)
					continue;
				stateList.add(s.substring(i, i+j));
			}
		}
		Collections.sort(stateList);
		for(int i=0; i<stateList.size(); i++) {
			sub[i] = stateList.get(i);
		}
		for(int i=0; i<stateList.size(); i++) {
			if(sub[i]!=sub[i+1])
				cnt++;
			if(cnt==k) {
				System.out.println(sub[i]);
				return;
			}
		}
	}
}
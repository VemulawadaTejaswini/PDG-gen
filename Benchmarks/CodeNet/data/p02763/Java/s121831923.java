import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	public void solve() throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
		char[] str = sc.readLine().toCharArray();
		int q = Integer.parseInt(sc.readLine());
		
		ArrayList<TreeSet<Integer>> treeSetList = new ArrayList<>();
		for(int i = 0; i < 26; i++) {
			treeSetList.add(new TreeSet<>());
		}
		for(int i = 0; i < n; i++) {
			char ichar = str[i];
			int charVal = ichar - 97;
			treeSetList.get(charVal).add(i);
		}
		
		
		for(int i = 0; i < q; i++) {
			String[] queryArr = sc.readLine().split(" ");
			int queryNo = Integer.parseInt(queryArr[0]);
			if(queryNo == 1) {
				int pos = Integer.parseInt(queryArr[1]) - 1;
				char inputChar = queryArr[2].charAt(0);
				char nowChar = str[pos];
				str[pos] = inputChar;
				treeSetList.get(nowChar-97).remove(pos);
				treeSetList.get(inputChar-97).add(pos);
			}else if(queryNo == 2){
				
				int left = Integer.parseInt(queryArr[1]) - 1;
				int right = Integer.parseInt(queryArr[2]) - 1;
				int ans = 0;
				for(TreeSet<Integer> treeSet : treeSetList) {
					Integer ceilPos = treeSet.ceiling(left);
					
					if(ceilPos != null && ceilPos <= right) {
						ans++;
					}
				}
				System.out.println(ans);
			}
		}
		
		sc.close();
	}
}

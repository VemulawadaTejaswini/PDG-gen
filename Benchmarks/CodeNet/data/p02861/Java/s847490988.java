import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //Use String arraylist
		//Very similar to "permutations" on LeetCode (look into List data structure)
		//Can use this to generate all unique anagrams of a word with a complementary hashset
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		double[][] coords = new double[N][2];
		for (int i = 0; i < N; i++) {
			coords[i][0] = input.nextDouble();
			coords[i][1] = input.nextDouble();
		}
		double ans = 0.0;
		ArrayList<String> seq = recur(N,N);
		for (int i = 0; i < seq.size(); i++) {
			String[] curPos = seq.get(i).trim().split(" ");
			int STARTtown = Integer.parseInt(curPos[0])-1; //0 based indexing adjustment
			double curX = coords[STARTtown][0];
			double curY = coords[STARTtown][1];
			for (int town = 1; town < N; town++) {
				int ENDtown = Integer.parseInt(curPos[town])-1;
				double EndX = coords[ENDtown][0];
				double EndY = coords[ENDtown][1];
				double X = Math.abs(curX-EndX);
				double Y = Math.abs(curY-EndY);
				double distance = Math.sqrt(X*X+Y*Y);
				ans+=distance;
				curX = EndX;
				curY = EndY; //Re-updating current position
			}
		}
		double perms = (double)(seq.size());
		ans/=perms; //Going from sum to average of distances
		System.out.println(ans);
	}	
	public static ArrayList<String> recur(int N,int total) {
		ArrayList<String> ans = new ArrayList<String>();
		if (N==1) {
			for (int i = 1; i <= total; i++) {
				String curans = Integer.toString(i)+" ";
				ans.add(curans);
			}
			return ans;
		}
		ArrayList<String> seq = recur(N-1,total);
		for (int i = 0; i < seq.size(); i++) {
			String[] prev = seq.get(i).split(" ");
			boolean[] used = new boolean[total+1]; 
			for (int j = 0; j < prev.length; j++) {
				int number = Integer.parseInt(prev[j]);
				used[number]=true;
			}
			for (int pos = 1; pos <= total; pos++) {
				if (!used[pos]) {
					String cur = seq.get(i).trim();
					cur+=" "+Integer.toString(pos)+" ";
					ans.add(cur);
				}
			}
		}
		return ans;
	}
}
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String[] str = {sc.next(), sc.next()};
			String max = str[0].length() > str[1].length() ? str[0] : str[1];
			String min = str[0].length() > str[1].length() ? str[1] : str[0];
			
			short[][] dp = new short[max.length()+1][min.length()+1];
			int count = 0;
			
			for(int i = 0; i < max.length(); i++){
				for(int j = 0; j < min.length(); j++){
					if(max.charAt(i) == min.charAt(j)){
						dp[i+1][j+1] = (short) (dp[i][j] + 1);
						count = Math.max(count, dp[i+1][j+1]);
					}
				}
			}
			
			System.out.println(count);
		}

	}

}
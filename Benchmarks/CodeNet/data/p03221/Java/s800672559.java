import java.*;
import java.util.Scanner;
import java.util.ArrayList;


public class Main{
	static int N,M;
	static String[] List;
	static String[][] city;
	static String[] Answer;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss = new Scanner(System.in);
		N = ss.nextInt();
		M = ss.nextInt();
		ArrayList<String[]> strArray = new ArrayList<String[]> ();
		List = new String[M];
		city = new String[M][4];
		for (int i = 0; i < M; i++) {
			city[i][0] = ss.next();
			city[i][1] = ss.next();	
			String aa = Integer.toString(i);
			city[i][3] =aa;
		}
		Main ts = new Main();
		ts.makesort(city , 1);
		
		city[0][2]="1";
		for (int i = 1; i < M; i++) {
			int j;
			for ( j = i-1; j >= 0; j--) {
				if(city[i][0].compareTo(city[j][0])!=0)continue;
				if(city[i][0].compareTo(city[j][0])==0) {
					int cnt = Integer.parseInt(city[j][2]);
					cnt++;
					String f = Integer.toString(cnt);
					city[i][2]= f;
					break;
				}
			}
			if(j<0)city[i][2] = "1";
		}
		
		for (int i = 0; i < M; i++) {
			String x = ts.format(city[i][0]);
			city[i][0] = x;
			String y = ts.format(city[i][2]);
			city[i][2] = y;
		}
		ts.makesort(city , 3);
		for (int i = 0; i < M; i++) {
			System.out.print(city[i][0]+city[i][2]);
			System.out.println();

		}
		
	}
	
	private void makesort(String[][] s, int x) {
		for (int j = 0; j < s.length; j++) {
			for (int i = 0; i < s.length - 1; i++) {
				String[] ss;
				if (s[i][x].compareTo(s[i + 1][x]) > 0) {
					ss = s[i];
					s[i] = s[i + 1];
					s[i + 1] = ss;
				}
			}
		}
		
	}
	public String format(String a) {
		int len = a.length();
		int n = 6-len;
		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder(a);
			sb.insert(0, "0");
			a = sb.toString();
		}
		return a;
		
	}


}

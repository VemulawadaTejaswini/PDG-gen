import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = sc.nextInt();
		int k = sc.nextInt();
		int all = n*(n-1)/2;
		if(all - k < n-1){
			bw.write("-1"); bw.flush(); bw.close();
		}
		else{
			int count = 0;
			all -= (n-1+k);
			StringBuilder sb = new StringBuilder();
			for(int i = 2; i <= n; i++){
				sb.append(String.format("%d %d\n", 1, i));
				count++;
			}
			if(all > 0){
				for(int i = 2; i <= n; i++){
					for(int j = i+1; j <= n; j++){
						sb.append(String.format("%d %d\n", i, j));
						count++;
						all--;
						if(all <= 0) break;
					}
					if(all <= 0) break;
				}
			}
			bw.write(String.format("%d\n", count));
			bw.write(sb.toString());
			bw.flush(); bw.close();
		}
	}
}

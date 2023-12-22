import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] strs = str.split(" ");
		int a = Integer.parseInt(strs[0]);
		int b = Integer.parseInt(strs[1]);
		int c = Integer.parseInt(strs[2]);
		int[] ans = {a, b, c};
		for(int i = 0; i < ans.length; i++){
			for(int x = i; x < ans.length; x++){
				if(ans[x] < ans[i]){
					int w = ans[x];
					ans[x] = ans[i];
					ans[i] = w;
				}//if
			}//for
		}//for
		System.out.println(ans[0] + " " + ans[1] + " " + ans[2]);
		br.close();
	}
}
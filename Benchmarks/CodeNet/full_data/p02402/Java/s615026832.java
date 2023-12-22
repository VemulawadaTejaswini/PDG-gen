import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String[] strs = str.split(" ");
		int min = Integer.parseInt(strs[1]);//最小
		int max = 0;//最大
		int sum = 0;//合計
		for(int i = 0; i < strs.length; i++){
			if(min > Integer.parseInt(strs[i])){
				min = Integer.parseInt(strs[i]);
			}else{
				max = Integer.parseInt(strs[i]);
			}//if
			sum += Integer.parseInt(strs[i]);
		}//for
		System.out.println(min + " " + max + " " + sum);
	}
}
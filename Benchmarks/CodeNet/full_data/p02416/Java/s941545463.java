import java.io.*;

public class Main{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ans[] = new int[100];
		char ch[] = new char[1000];
		int len, i, cnt = 0;
		String str;
		
		for(i = 0; i < 100; i++){
			ans[i] = 0;
		}
		
		while(true){
			str = br.readLine();
			if(str.equals("0")){
				break;
			}
			
			len = str.length();
			ch = str.toCharArray();
			
			for(i = 0; i < len; i++){
				ans[cnt] += Character.digit(ch[i], 10);
			}
			
			cnt ++;
		}
		
		for(i = 0; i < cnt; i++){
			System.out.println(ans[i]);
		}
	}
}
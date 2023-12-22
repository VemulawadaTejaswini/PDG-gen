import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		for(int i=0;i<cnt;i++){
		System.out.print(str[cnt-i-1]);
		}
		System.out.println();
	}
}
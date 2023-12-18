import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = new String(in.readLine());
        String[] abc = s.split(",");
		// 整数の入力
		int a = Integer.parseInt(abc[0]);
		// スペース区切りの整数の入力
		int b = Integer.parseInt(abc[1]);
		// スペース区切りの整数の入力
		int c = Integer.parseInt(abc[2]);
		StringBuilder buff = new StringBuilder();
		
		while(true) {
		if(a!=0) {
			buff.append("a");
			a--;
		}else if(c!=0) {
			buff.append("c");
		}else if(b!=0) {
			buff.append("b");
		} else {
			System.out.println(buff);
			return;
		}
		
	}
}
}
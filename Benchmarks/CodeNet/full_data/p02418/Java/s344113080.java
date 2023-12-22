import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] cr1 = str.toCharArray();
		str = br.readLine();
		char[] cr2 = str.toCharArray();
		String dis = "NO";
		int x;
		for(int i=0; i<cr1.length; i++){
			if(cr1[i]==cr2[0]){
				dis = "YES";
				x = i;
				for(int j=1; j<cr2.length; j++){
					x++;
					if(x == cr1.length) x=0;
						if(cr1[x]!=cr2[j]){
							dis = "NO";
							break;
						}
				}
			}
		}
		System.out.println(dis);
	}
}
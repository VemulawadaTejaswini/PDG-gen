import java.io.*;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String lns[] = br.readLine().split(" ");
			int ln[] = parseInts(lns);
			if(ln[0]==0 && ln[1]==0) break;
			for(int x=0; x<ln[0] ;x++){
				for(int y=0; y<ln[1]; y++){
					if(y==ln[1]-1){
						System.out.println("#");
					}else if(y==0 || x==0 || x==ln[0]-1){
						System.out.print("#");
					}else{
						System.out.print(".");
					}
				}
			}
			System.out.println();
		}
	}
	static int[] parseInts(String[] s){
		int[] x = new int[s.length];
		for(int i=0;i<s.length;i++){
			x[i] = Integer.parseInt(s[i]);
		}
		return x;
	}
}
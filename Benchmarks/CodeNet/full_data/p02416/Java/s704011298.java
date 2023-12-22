import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum;
		while(true){
			sum=0;
			String str = br.readLine();
			char[] cr = str.toCharArray();
			int[] in = parseInts(cr);
			for(int i=0;i<in.length;i++){
				sum += in[i];
			}
			if(sum==0) break;
			System.out.println(sum);
		}
	}
	static int[] parseInts(char[] c){
		int[] x = new int[c.length];
		for(int i=0;i<c.length;i++){
			x[i] = Character.getNumericValue(c[i]);
		}
		return x;
	}
}
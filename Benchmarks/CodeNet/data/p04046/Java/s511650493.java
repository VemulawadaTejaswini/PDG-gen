import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int H = Integer.parseInt(line[0]);
		int W = Integer.parseInt(line[1]);
		int A = Integer.parseInt(line[2]);
		int B = Integer.parseInt(line[3]);
		long t = 1000000007;

		long[] k = new long[W];
		long[] n = new long[W-B];
		for(int i=0;i<H-A;i++){
			for(int j=0;j<W;j++){
				if(i==0&&j==0){
					k[0] = 1;
				}else if(i==0){
					k[j]=k[j-1];
				}else if(j==0){
					k[j] = k[j];
				}else{
					k[j] = k[j]+k[j-1];
					k[j] %= t;
				}
			}
		}
		for(int i=0;i<W-B;i++){
			if(i==0){
				n[i] = k[B+i];
			}else{
				n[i] = n[i-1]+k[B+i];
			}
		}
		for(int i=H-A+1;i<H;i++){
			for(int j=0;j<W-B;j++){
				if(j==0){

				}else{
					n[j]=n[j]+n[j-1];
				}
				n[j] %= t;
			}
		}
		System.out.println(n[n.length-1]);
	}
}

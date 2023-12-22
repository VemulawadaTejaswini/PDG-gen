import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class Main{

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		

		int n = Integer.parseInt(br.readLine());
		int[] in = new int[n];
		int max = Integer.MIN_VALUE;
		int mini = 0;
		int maxj=0;
		boolean con=false;
		
		for (int i = 0; i < n; i++)
			in[i] = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n - 1; i++) {
			if (in[i] > in[mini])continue;
			for (int j = i + 1; j < n; j++){
				if(i!=0&&con&&i<maxj){
					mini=i;
					max=in[maxj]-in[i];
					break;}
				else if(max+in[i]<in[j]){
					max=in[j]-in[i];
					mini=i;
					maxj=j;
					con=false;
				}
			}con=true;
		}
		System.out.println(max);
	}}
import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			/* input */
			while(true){
				line = br.readLine();
				int n = Integer.parseInt(line.split(" ")[0]), m = Integer.parseInt(line.split(" ")[1]);
				if(n==0&&m==0) break;

				int[] t = new int[n+m];

				if(n>0){
					line = br.readLine();
					for(int i=0;i<n;i++){
						t[i] = Integer.parseInt(line.split(" ")[i]);
					}
				}

				if(m>0){
					line = br.readLine();
					for(int i=n;i<n+m;i++){
						t[i] = Integer.parseInt(line.split(" ")[i-n]);
					}
				}
				if(n+m==1){
					System.out.println(t[0]);
					continue;
				}
				Arrays.sort(t);

				int max = 0;
				for(int i=0;i<n+m-1;i++){
					if(t[i+1]-t[i]>max) max = t[i+1]-t[i];
				}

				System.out.println(max);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
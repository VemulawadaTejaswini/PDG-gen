import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n;
			
			while(true){
				/* input from here */
				String[] l = r.readLine().split(" ");
				n = Integer.parseInt(l[0]);
				if(n==0){
					break;
				}
				int begin = Integer.parseInt(l[1])+1, end = Integer.parseInt(l[2]);
				
				int[] available = new int[end-begin+2];
				Arrays.fill(available,n);
				

				int[][][] cmduration = new int[n][10][2];
				int[] numofcm = new int[n];
				for(int i=0;i<n;i++){
					numofcm[i] = 0;
					int c = Integer.parseInt(r.readLine());
					String[] cms = r.readLine().split(" ");
					for(int j=0;j<c;j++){
						cmduration[i][j][0] = Integer.parseInt(cms[2*j])+1;
						cmduration[i][j][1] = Integer.parseInt(cms[2*j+1]);
						numofcm[i]++;
					}
				}
				
				//look for available channels
				int[] cmpos = new int[n];
				Arrays.fill(cmpos, 0);
				for(int i=0;i<n;i++){
					while(cmpos[i]<numofcm[i]){
						for(int j=cmduration[i][cmpos[i]][0];j<=cmduration[i][cmpos[i]][1];j++){
							available[j-begin] -= 1;
						}
						cmpos[i]++;
					}
				}
				
				int longest = 0;
				for(int i=0;i<=end-begin;i++){
					//System.out.print(i + " " + available[i] + " ");
					int sum = 0;
					while(available[i]!=0&&i<available.length-1){
						if(i%100>=60){
							i++;
							continue;
						}
						i++;
						sum++;
					}
					if(sum>longest){
						longest = sum;
					}
				}
				System.out.println(longest);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
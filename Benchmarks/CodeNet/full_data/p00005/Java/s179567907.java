import java.io.IOException;
import java.util.StringTokenizer;

class GCDAndLCM{
	public static void main(String args[]) throws IOException{
		java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		try{
			while(in.readLine() != null){
				long num [] = new long[4];
				String s = in.readLine();
				StringTokenizer st = new StringTokenizer(s);
				num[0] = Long.parseLong(st.nextToken());
				num[1] = Long.parseLong(st.nextToken());
				num[2] = num[0];
				num[3] = num[1];
				
				while(num[0] != num[1]){
					if(num[1] > num[0]){
						num[1] = num[1] - num[0];
					}else{
						num[0] = num[0] - num[1];
					}
					if(num[0] % num[1] == 0 || num[1] % num[0] == 0){
						num[0] = Math.min(num[0], num[1]);
						break;
					}
				}
				System.out.print(num[0]);
				System.out.print(" ");
				System.out.println(num[2] / num[0] * num[3]);
			}
		}catch (Exception e) {
			System.exit(0);
		}
	}

}
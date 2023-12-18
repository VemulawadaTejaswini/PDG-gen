import java.io.*;

class Main{

	public static void main(String arg[]) throws IOException{
		String message;
		int n=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		message = br.readLine();
		String num[] = message.split(" ");
		message = br.readLine();
		String nagasa[] = message.split(" ");
		n = Integer.parseInt(num[0]);
		int numnum[] = new int[n];
		long long int all = 0;
		int harf = 0;
		for(int i=0;i<n;i++){
			numnum[i] = Integer.parseInt(nagasa[i]);
			all += numnum[i];
		}
		long long int akun = 0;
		long long int bkun = 0;
		long long int maxlong=9999999;
		for(int i=1;i<n+1;i++){
			for(int j=1;j<i+1;j++){
				akun += numnum[j-1];
			}
			if(maxlong>Math.abs(all-akun)){
				maxlong = Math.abs(all - (akun));
			}
			akun = 0;
		}
		System.out.println(""+maxlong);

		
	}
}
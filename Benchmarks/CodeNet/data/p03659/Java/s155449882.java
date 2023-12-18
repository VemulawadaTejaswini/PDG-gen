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
		long all = 0;
		int harf = 0;
		for(int i=0;i<n;i++){
			numnum[i] = Integer.parseInt(nagasa[i]);
			all += numnum[i];
		}
		long akun = 999999999999999999L;
		long maxlong=99999999999999L;
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				if(n-j==1)break;
				akun += numnum[j];
			}
			if(maxlong>Math.abs(all- 2*akun)){
				maxlong = Math.abs(all - 2*(akun));
			}
			akun = 0;
		}
		System.out.println(""+maxlong);

		
	}
}
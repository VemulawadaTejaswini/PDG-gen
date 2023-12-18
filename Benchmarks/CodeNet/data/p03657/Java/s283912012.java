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
		int max = 0;
		int harf = 0;
		for(int i=0;i<n;i++){
			numnum[i] = Integer.parseInt(nagasa[i]);
			max += numnum[i];
		}
		harf = max/2;
		int akun = 0;
		int bkun = 0;
		int i = 0;
		int maxlong=0;
		while(akun<harf){
			akun += numnum[i];
			i++;
			if(n-i==1)break;
		}
		while(i<n){
			bkun += numnum[i];
			i++;
		}
		maxlong = Math.abs(akun - bkun);
		System.out.println(""+maxlong);

		
	}
}
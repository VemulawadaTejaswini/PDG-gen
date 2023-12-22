class Main{

	public static void main(String[] args) throws IOException {
		java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		try{
			String s = in.readLine();
			StringTokenizer st;
			while(s != null){
				st = new StringTokenizer(s);
				int p = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
				System.out.println((int)Math.log10(p)+1);
				s = in.readLine();
			}
		}catch(Exception ex){
			System.exit(0);
		}
	}
}
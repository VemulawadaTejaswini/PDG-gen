class Main {
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			int n = Integer.parseInt(str);
			System.out.println((int)Math.pow(n, 3));
		} catch( IOException e) {
			e.printStackTrace();
		}
	}
}
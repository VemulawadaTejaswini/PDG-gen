public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System .in));
		String str=br.readLine();
		long S=Integer.parseInt(str);
		long h=S/3600;
		long m=S%3600/60;
		long s=S%60;
                System.out.println(h+":"+m+":"+s);
	}

}

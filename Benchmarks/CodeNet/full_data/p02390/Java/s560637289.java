public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	String s;
	int x;
	s= buf.readLine();
	x= Integer.parseInt(s);
	int a = x/3600;
	int b = (x%3600)/60;
	int c = (x%3600)%60;
	System.out.println(a+":"+b+":"+c);
	}
}
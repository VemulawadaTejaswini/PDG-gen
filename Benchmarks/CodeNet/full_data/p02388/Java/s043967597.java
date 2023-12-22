public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader br = new InputStreamReader(System.in);
        BufferedReader is = new BufferedReader(br);
        String str = is.readLine();
        int a = Integer.parseInt(str);
        
        a=a*a*a;
        
        System.out.println(a);
	}
}
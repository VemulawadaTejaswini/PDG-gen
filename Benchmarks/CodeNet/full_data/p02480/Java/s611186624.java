public class Main {
	public static void main(String[] args) throws Exception{
		java.io.BufferedReader read = new java.io.BufferedReader(
				new java.io.InputStreamReader(System.in));
		int x = Integer.parseInt(read.readLine());
		System.out.println(x*x*x);
	}
}
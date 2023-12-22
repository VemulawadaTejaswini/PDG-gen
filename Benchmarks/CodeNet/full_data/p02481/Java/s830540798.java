public class Main {
	public static void main(String[] args) throws Exception{
		java.io.BufferedReader read = new java.io.BufferedReader(
				new java.io.InputStreamReader(System.in));
		String x = read.readLine();
		String array[] = (x.split(" "));
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);
		System.out.println(a*b + " " + (2*a+2*b));
	}
}
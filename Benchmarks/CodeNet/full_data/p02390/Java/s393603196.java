public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int seconds = Integer.parseInt(br.readLine());

		int hh = seconds / 3600;
		int mm = seconds / 3600 / 60;
		int ss = seconds % 3600 % 60;

		System.out.println(hh + ":" + mm + ":" + ss);
	}
}
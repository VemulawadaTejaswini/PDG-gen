public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String data[] = reader.readLine().split(" ");
		int a= Integer.parseInt(data[0]);
		double b= Double.parseDouble(data[1]);
			
		System.out.println(Integer.toString((int)(a/b))+" "+Integer.toString((int)(a%b))+ " " + Double.toString(a/b));
	}
}
import java.io.*;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();

		int width = Integer.parseInt(str1);
		int hight = Integer.parseInt(str2);

		int area = width * hight;
		int around = width*2 + hight*2;

		System.out.println(area + " " + around);
	}
}
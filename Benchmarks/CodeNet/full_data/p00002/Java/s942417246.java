import java.io.*;
public class Ex02 {

	public static void main(String[] args)throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br =new  BufferedReader(is);
		System.out.println("Hello world");
		while(true){
			String str = br.readLine();
			if(str.equals(""))
				break;
			String str1 = str.substring(0, str.indexOf(" "));
			String str2 = str.substring(str.indexOf(" ")+1);
			int n1 = Integer.parseInt(str1);
			int n2 = Integer.parseInt(str2);
			int count1=0, count2=0;
			System.out.println("Hello world");
			while(n1 > 0){
				n1 = n1/10;
				count1++;
			}
			while(n2 > 0){
				n2 = n2/10;
				count2++;
			}
			System.out.println(count1+count2);
		}
	}

}
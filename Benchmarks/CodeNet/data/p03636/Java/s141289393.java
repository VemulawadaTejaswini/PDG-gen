import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		str=bfr.readLine();
		int mojisu=str.length();
		String kekka=str.charAt(0)+""+(mojisu-2)+""+str.charAt(mojisu-1);
		System.out.println(kekka);
	}
}
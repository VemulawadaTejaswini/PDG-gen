import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		int kaisu=0;
		String str="";
		str=bfr.readLine();
		kaisu=Integer.parseInt(str);
		int ninzu=0;
		String[] ba=new String[2];
		for(int i=0; i<kaisu; i++) {
			str=bfr.readLine();
			ba=str.split(" ");
			ninzu+=Math.abs(Integer.parseInt(ba[0])-Integer.parseInt(ba[1]))+1;
		}
		System.out.println(ninzu);
	}
}
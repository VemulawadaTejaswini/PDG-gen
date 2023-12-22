package hogehoge; 
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int count = 0;
		boolean bool = false;
		for(int i = 0 ; i < str.length;i++){
			for(int j = 0 ;j<25;j++){
				bool = check(str[i],j+1);
				if(bool == true){
					print(str,j+1);
					System.exit(0);
				}
			}
		}
	}
	public static void print(String[] str,int n){
		for(int i = 0 ; i < str.length;i++){
			for(int j = 0 ; j < str[i].length();j++){
				if(str[i].charAt(j)=='.')
					System.out.println(".");
				else if(str[i].charAt(j)<97+n)
					System.out.print((char)(str[i].charAt(j)+26-n));
				else
					System.out.print((char)(str[i].charAt(j)-n));
			}
			System.out.print(" ");
		}
	}
	public static boolean check(String a,int n){
		String th = "";
		for(int i = 0 ; i < a.length(); i++){
			if(a.charAt(i)<97+n)
				th+=(char)(a.charAt(i)+26-n);
			else
				th+=(char)(a.charAt(i)-n);
		}
		//System.out.println(th);
		if(th.equals("this")||th.equals("the")||th.equals("that")){
			return true;
		}
		return false;
	}
}
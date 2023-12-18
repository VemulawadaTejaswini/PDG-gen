import java.util.*;
import java.io.*;
class Main{
	public static void main(String[] args)throws IOException{
		final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S=br.readLine();
		System.out.println(getStationPair(S));
	}
	public static String getStationPair(String S){
		if(S.length()>3){
			return "No";
		}
		if(S.contains("BBB")||(S.contains("AAA"))){
			return "No";
		}
		for(int i=0;i<S.length();i++){
			char c=S.charAt(i);
			if(c!='A'||c!='B'){
				return "No";
			}
		}	
		return "YES";	
	}
}

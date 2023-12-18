
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	static BufferedReader reader;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		
		int[] is = readLine().chars().toArray();
		
		boolean before = is[0]=="1".charAt(0);
		int cnt = 0;
		for(int i=0;i<is.length;i++) {
			char c = (char) is[i];
			if(c==-1) break;
			if(before^(c=="1".charAt(0))) {cnt++;}
			before = !before;
		}
		if(cnt*2>is.length) {System.out.println(is.length-cnt);}
		else {System.out.println(cnt);}
		
	}

	private static String readLine(){
		try{
			return reader.readLine();
		}catch(Exception e){
			return e.getMessage();
		}
	}
}

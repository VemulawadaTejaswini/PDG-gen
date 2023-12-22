import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args)throws Exception {

		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        while(true){
	        	String line = br.readLine();
	        	//文字列に先頭又は最後に空白文字がくっ付いている場合、それらを全て取り除く。
	        	line = line.trim();
	        	//半角スペースを区切り文字として扱う
	        	String[] readLineArray = line.split("[\\s+]");
	        	//変数に配列を代入
	        	int a = Integer.parseInt(readLineArray[0]);
	        	int b = Integer.parseInt(readLineArray[1]);
	        	if(a == 0 && b == 0){
	        		break;
	        	}
	        	for(int i = 0;i < a;i++){
	        		for(int j = 0;j < b; j++){
	        			System.out.printf("#");
	        		}
	        		System.out.printf("\n");
	        	}
	        	System.out.printf("\n");
	        	
	        }

	}

}
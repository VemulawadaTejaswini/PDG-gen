import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args)throws Exception {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String line = br.readLine();
	    //文字列に先頭又は最後に空白文字がくっ付いている場合、それらを全て取り除きます。
	    line = line.trim();
	    //半角スペースを区切り文字として扱う
	    String[] readLineArray = line.split("[\\s+]");
	    //変数に配列を代入
	    int count = 0;
	    int a = Integer.parseInt(readLineArray[0]);
	    int b = Integer.parseInt(readLineArray[1]);
	    int c = Integer.parseInt(readLineArray[2]);
	    for (int i = a;i<=b;i++){
	    	if(c%i ==0){
	    		count++;
	    	}
	    }
	    System.out.println(count);
	}

}
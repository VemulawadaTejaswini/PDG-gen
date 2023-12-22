import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
	Scanner scan = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	while(true){
	    String str=scan.next();
	    if(str=="-")break;
	    int m = scan.nextInt();
	    for(int n = 0; n < m ; n++){
		int l = scan.nextInt();
		String str1 = str.substring(l);
		String str2 = str.substring(0,l);
	        String str3 = str1.concat(str2);
                System.out.println(str3);
	    }
	}
	if (br != null){
	    br.close();
	    br = null;
	}
    }
}
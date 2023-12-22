

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws Exception {
try {
	BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	String input = buf.readLine();
	
	String[] strAry = input.split(" ");
    int a = Integer.parseInt(strAry[0]);
    int b = Integer.parseInt(strAry[1]);
    int c = Integer.parseInt(strAry[2]);
	
    int count = 0; 
    
for (int i = a; i <= b; i++) {
	if(c%i == 0){
count ++;
	}
}

System.out.println(count);

} catch (Exception e) {
	// TODO: handle exception
}
		 }
    }
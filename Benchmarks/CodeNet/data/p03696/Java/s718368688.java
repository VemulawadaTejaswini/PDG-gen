import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int  num = Integer.parseInt(br.readLine());
	String s = br.readLine();
	int left = 0;
	int right =0;
	for (int i = 0; i < num; i++) {
	    if(s.charAt(i) == '(') left++;
	    else right++;
	    if (left  < right) {
		s = "(" + s;
		num++;
		left++;
	    }
	}
	for (int i = left - right; i > 0; i--) {
	    s = s + ")";
	}
	System.out.println(s);
    }
}

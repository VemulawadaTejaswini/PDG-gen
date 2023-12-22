import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;import java.util.Collections;

 
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
	    String str=reader.readLine();
	    String s[]=str.split(" ");
	    int h=Integer.parseInt(s[0]);
	    int r=Integer.parseInt(s[1]);

	    int top=h+r;
	    int bottom=h-r;
	    if(top<0){
		System.out.println("-1");
	    }else if(top==0){
		System.out.println("0");
	    }else if(top>0){
		System.out.println("1");
	    }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


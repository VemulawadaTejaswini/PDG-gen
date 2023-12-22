
import java.util.*;
import java.awt.geom.*;
import java.io.*;
public class Main{

    private void doit(){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(sc.hasNext()){
            String input = sc.next();
            if(isP(input)){
	        count++;
            }
	}
        System.out.println(count);
    }

    private boolean isP(String str){
        int len = str.length();
        int mid = len / 2;
        int start = len / 2;
        if(len % 2 == 0) start--;
	int end = len / 2;
        for(int i = 0; i + end < str.length(); i++){
	    if(str.charAt(end + i) != str.charAt(start - i)){
                return false;
            }
    	}
        return true;
    }



    public static void main(String [] args){
            new Main().doit();
    }
}
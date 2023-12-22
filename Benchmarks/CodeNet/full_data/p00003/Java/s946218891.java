import java.io.*;
import java.util.*;

class aoj00004{
    public static void main(String[] a) throws IOException{
    	//String input = new String();
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    	String   input2  = input.readLine();
    	String[] str1ary = input2.split(" ");

		if(str1ary.length == 3){
			if(Integer.valueOf(str1ary[0]) * Integer.valueOf(str1ary[0]) + Integer.valueOf(str1ary[1]) * Integer.valueOf(str1ary[1]) == Integer.valueOf(str1ary[2]) * Integer.valueOf(str1ary[2])){
					System.out.println("YES");
				}
			else{
					System.out.println("NO");
			}
		}
    }
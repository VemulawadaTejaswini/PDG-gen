import java.io.*;
import java.util.*;
import java.util.Collections;
 
class Main{
    public static void main(String[] a) throws Exception{
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	Integer[] mountains=new Integer[10];
    	for(int i=0;i<10;i++){
    		mountains[i]=Integer.valueOf(br.readLine());
    	}
    	Arrays.sort(mountains, Collections.reverseOrder());
		for(int i=0;i<3;i++){
			System.out.println(mountains[i]);
		}    	
    }
}
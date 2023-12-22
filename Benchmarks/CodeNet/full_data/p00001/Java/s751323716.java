import java.io.*;
import java.util.*;
 
class Main{
    public static void main(String[] a) throws Exception{
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	int[] mountains=new int[10];
 
    	for(int i=0;i<10;i++){
    		mountains[i]=Integer.parseInt(br.readLine());
    	}
    	Arrays.sort(mountains);
		for(int i=0;i<3;i++){
			System.out.println(mountains[i]);
		}    	
    }
}
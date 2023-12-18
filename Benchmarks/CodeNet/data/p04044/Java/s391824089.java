import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = reader.readLine().split(" ");
        int t = Integer.parseInt(list[0]);
        String[] l = new String[t];
        for(int i = 0 ;i<t;i++){
            l[i] = reader.readLine();
        }
        Arrays.sort(l);
        for(String p:l){
        	System.out.print(p);
            }
	}}
        
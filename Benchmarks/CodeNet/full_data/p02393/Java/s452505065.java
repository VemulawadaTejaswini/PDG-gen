import java.io.*;
import java.util.*;

public class Main{
public static void main(String[] args){
	try{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] str = br.readLine().split(" ");
	Set<Integer> num = new TreeSet<Integer>();
	
		for(int i = 0; i < str.length; i++){
		num.add(Integer.parseInt(str[i]));
		}
	
		for(int n : num){
		System.out.print(n+" ");
		}
	
	System.out.println();

	}catch(IOException e){
	System.out.println(e);
	}
}	
}
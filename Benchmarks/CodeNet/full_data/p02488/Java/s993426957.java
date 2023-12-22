import java.util.Scanner;
import java.io.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String beg = "zzz";
	int n = sc.nextInt();
	for(int i=0;i<n;i++){
	    try{
		String line = reader.readLine();
		if(i == 0) beg = line;
		else if(line.compareTo(beg)<0) beg = line;
	    }catch(IOException e){
		System.out.println(e);
	    }		
	}
	System.out.println(beg);
    }   
}
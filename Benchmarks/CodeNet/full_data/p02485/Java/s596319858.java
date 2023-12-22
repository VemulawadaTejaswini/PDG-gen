import java.io.*;

public class Main{
    public static void main(String[] args){
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	while(true){
	    int sum = 0;
	    try{
		String line = reader.readLine();
		int l = line.length();
		for(int i=0;i<l;i++){
		    char c = line.charAt(i);
		    sum+=c - '0';
		}
	    } catch(IOException e){
		System.out.println(e);
	    }
	    if(sum == 0) break;
	    System.out.println(sum);
	}	
    }
}
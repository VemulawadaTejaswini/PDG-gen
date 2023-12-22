import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public void exec() throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter out = new PrintWriter(System.out);
    	int[] count = new int[26];
    	while (br.ready()){
        	String l = br.readLine();
        	for(char c: l.toCharArray()) {
        		int alpIdx = -1;
        		if ('a' <= c && c <= 'z') {
        			alpIdx = c - 'a';
        		}else if ('A' <= c && c <= 'Z'){
        			alpIdx = c - 'A';
        		}
        		if(alpIdx>=0){
        			count[alpIdx]++;
        		} 
        	}
    	}
    	char c = 'a';
    	int i = 0;
    	while(i<count.length) {
    		out.print(c++);
    		out.print(" : ");
    		out.println(count[i++]);
    	}
        out.flush();
    }
 
    public static void main(String[] args) throws IOException {
    	new Main().exec();
    }
}
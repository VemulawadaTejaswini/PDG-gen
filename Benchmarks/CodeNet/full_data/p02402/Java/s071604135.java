
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        while(true) {
	            String[] line = br.readLine().split(" ");
	            int max = Integer.parseInt(line[1]);
	            int min = Integer.parseInt(line[1]);
	            int sum = 0;
	            for(int i = 1;i<=Integer.parseInt(line[0]);i++){
	            	if(max<Integer.parseInt(line[i])){
	            		max = Integer.parseInt(line[i]);
	            	}
	            	if(min>Integer.parseInt(line[i])){
	            		min = Integer.parseInt(line[i]);
	            	}
	            	sum += Integer.parseInt(line[i]);
	            }
	            System.out.println(max + min + sum);
	        }    
	    }
}
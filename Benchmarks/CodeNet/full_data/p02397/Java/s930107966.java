import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws Exception {
    	InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int[] s = new int[2];
        while(true){
        	String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            if(x == 0 && y == 0){
            	break;
            }
            s[0] = x;
            s[1] = y;
            Arrays.sort(s);
            System.out.println(s[0] + " " + s[1] );
        }
    }
}
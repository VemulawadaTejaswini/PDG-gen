import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int i = 0;
        int x = 0;
        int[] num = new int[100];
        while(true){
        	line = br.readLine();
        	x = Integer.parseInt(line);
        	if(x == 0){
        		break;
        	}
        	num[i] = x;
        	i++;
        }
        int N = i;
        for(i = 0;i<N;i++){
        	System.out.println("Case "+(i+1)+": "+num[i]);
        }

	}

}
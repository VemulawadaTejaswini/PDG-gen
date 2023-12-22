import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception{
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int i = 0;
        int x = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();
        while(true){
        	line = br.readLine();
        	x = Integer.parseInt(line);
        	if(x == 0){
        		break;
        	}
        	array.add(x);
        	i++;
        }
        int N = i;
        for(i = 0;i<N;i++){
        	System.out.println("Case "+(i+1)+": "+array.get(i));
        }

	}

}
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String line;

	while( !((line=br.readLine()).equals("0")) ){
	    int n = Integer.valueOf(line);
	    long[] shine = new long[4001];
	    for(int i = 0; i < n; i++){
		String[] input = br.readLine().split(" " , 3);
		int shineNum = Integer.parseInt(input[0]);
		long score = Long.parseLong(input[1]) * Long.parseLong(input[2]);
		shine[shineNum] += score;
	    }

	    boolean a = false;
	    for(int i = 0; i < 4001; i++){
		if(shine[i] != 0 && shine[i] >= 1000000){
		    System.out.println(i);
		    a = true;
		}
	    }

	    if(!a) System.out.println("NA");

	}

    }

}
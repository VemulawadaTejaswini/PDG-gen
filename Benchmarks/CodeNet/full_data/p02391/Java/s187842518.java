import java.io.*;
import java.util.*;
public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer s = new StringTokenizer(br.readLine()," ");
	int input1 = Integer.parseInt(s.nextToken());
	int input2 = Integer.parseInt(s.nextToken());

	if(input1<input2){
	System.out.println("a < b");
	}else if (input1 == input2){
	System.out.println("a == b");
	}else{
	System.out.println("a > b");
	}
    }
}
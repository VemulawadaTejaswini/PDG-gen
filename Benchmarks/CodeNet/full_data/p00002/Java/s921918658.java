import java.io.BufferedReader;
import java.io.InputStreamReader;

class test {

    public static void main(String[] a){

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] input = br.readLine().split("\\s");

    	int a = Integer.parseInt(input[0]);
    	int b = Integer.parseInt(input[0]);
    	int sum = a + b;
    	String str = String.valueOf(sum);

    	System.out.println(str.length());

    }
}
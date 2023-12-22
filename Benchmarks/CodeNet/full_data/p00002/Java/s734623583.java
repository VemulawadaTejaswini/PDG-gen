import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] input;
    	int a;
		int b;
		int sum;

    	while((input = br.readLine().split("\\s")) != null){
    		a = Integer.parseInt(input[0]);
    		b = Integer.parseInt(input[0]);
    		sum = a+b;

    		String str = String.valueOf(sum);
    		System.out.println(str.length());
    		sum =0;
    	}
    }
}
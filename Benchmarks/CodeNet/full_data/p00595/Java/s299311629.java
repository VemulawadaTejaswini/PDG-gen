import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            System.out.println(findCommonDivisor(line));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static long findCommonDivisor(String line) {
    	String[] lineArray = line.split(" ", 0);
    	long x = Long.parseLong(lineArray[0]);
    	long y = Long.parseLong(lineArray[1]);

    	if(x < y) {
    		x = x + y;
        	y = x - y;
        	x = x - y;

    	}

    	while(y > 0) {
    		long r = x % y;
    		x = y;
    		y = r;

    	}

    	return x;
     }
}
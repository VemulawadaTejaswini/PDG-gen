import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer inputVal = new Integer(in.readLine());
        Integer outputVal = 0;
        for (int i = 0; i <= inputVal; i++) {
        	if (i % 2 == 0) {
        		continue;
        	}
        	Integer countVal = 0;
        	for (int s = 1;s <= i;s++) {
        		if (i % s == 0) {
        			countVal++;
        		}
        	}
        	if (countVal == 8) {
        		outputVal++;
        	}
        }
        System.out.println(outputVal);
   }
}
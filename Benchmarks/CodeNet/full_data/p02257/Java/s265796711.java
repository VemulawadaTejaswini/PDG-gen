import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /**
     * @param args
     * @throws IOException
     * @throws NumberFormatException
     */
    public static void main(String[] args) throws NumberFormatException,
            IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));

        int len = Integer.parseInt(reader.readLine());
        int[] arr = new int[len];

        String line;

        for (int i = 0; i < len; i++) {
            line = reader.readLine();
            arr[i] = Integer.parseInt(line);
        }
        
        int resultCount = 0;
        for (int j = 0; j < arr.length; j++) {
            if (isPrime(arr[j])) {
                resultCount++;
            }
        }

        System.out.println(resultCount);

    }

    private static boolean isPrime(int value) {

        if(value == 2) return true;
        if(value ==  3) return true;
        if(value ==  5) return true;
        if(value ==  7) return true;
        
        if(value % 2 == 0) return false;
        if(value % 3 == 0) return false;
        if(value % 5 == 0) return false;
        if(value % 7 == 0) return false;

        //double max = Math.sqrt(value);
        
        for (double i = 8; i < value; i ++ ) {
//            System.out.println("value:"+ value +" i:" + i +" r " + (value % i));
            if (value % i == 0) return false;
        }
        
        return true;
    }

}
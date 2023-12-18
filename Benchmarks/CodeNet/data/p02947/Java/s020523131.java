import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputN = Integer.parseInt(scan.nextLine());
        String[] inputLines = new String[inputN];
        for(int i=0; i<inputN; i++) {
            char[] inputChars = scan.nextLine().toCharArray();
            Arrays.sort(inputChars);
            inputLines[i] = String.valueOf(inputChars);
        }

        Integer result = 0;
        for(int i=0; i<inputLines.length; i++) {
            for(int j=i+1; j<inputLines.length; j++) {
                if(inputLines[i].equals(inputLines[j])) {
                    result++;
                }
            }
        }

        System.out.println(result);
        scan.close();
    }
}
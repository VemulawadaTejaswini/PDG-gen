import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> inputLines = new ArrayList<String>();
        Integer inputN = Integer.valueOf(scan.nextLine());
        for(int i=0; i<inputN; i++) {
            char[] inputChars = scan.nextLine().toCharArray();
            Arrays.sort(inputChars);
            inputLines.add(String.valueOf(inputChars));
        }

        Integer result = 0;
        for(int i=0; i<inputLines.size(); i++) {
            for(int j=i+1; j<inputLines.size(); j++) {
                if(inputLines.get(i).equals(inputLines.get(j))) {
                    result++;
                }
            }
        }

        System.out.println(result);
        scan.close();
    }
}
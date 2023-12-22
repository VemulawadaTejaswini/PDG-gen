import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> result =new ArrayList<Integer>();
        
        while (true) {
            
            String numLine = scanner.next();
            
            if ("0".equals(numLine)) {
                break;
            }
            
            int size = numLine.length();
            int sum = 0;
            for (int i=size; i>=1; i--) {
                int num = Integer.parseInt(numLine.substring(i-1, i));
                sum += num;
            }
            result.add(sum);
        }
        
        // display
        for (Integer i : result) {
            System.out.println(i);
        }
        
    }
}

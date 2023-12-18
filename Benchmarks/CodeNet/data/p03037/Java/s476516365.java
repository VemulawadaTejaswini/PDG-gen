import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] inputs = input.split(" ");

            int N = Integer.parseInt(inputs[0]);
            int M = Integer.parseInt(inputs[1]);

            Map<Integer,Integer> LR = new LinkedHashMap();
            for (int i = 0;i < M;i++) {
                String strLR = scanner.nextLine();
                String[] arrayLR = strLR.split(" ");
                LR.put(Integer.parseInt(arrayLR[0]),Integer.parseInt(arrayLR[1]));
            }

            int startPos = 0;
            int endPos = 0;
            
            for (Map.Entry<Integer,Integer>  en: LR.entrySet()) {
                
                if (startPos <= en.getKey()) {
                    startPos = en.getKey();
                }
                
                if (endPos >= en.getValue() || endPos == 0) {
                    endPos = en.getValue();
                }

            }           

            if (endPos >= startPos) {
                System.out.println(endPos - startPos + 1);
            } else {
                System.out.println(0);
            }
            
            scanner.close();
    }
}
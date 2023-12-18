import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String numA = scanner.nextLine();
        String numB = scanner.nextLine();
        String tmpNumStr = numA + numB;
        int num = Integer.parseInt(tmpNumStr);

        int div = 2;
        ArrayList<Integer> array = new ArrayList<Integer>();
        while(true) {
            if(num <= 1) {
                break;
            } else if(num % div == 0) {
                num /= div;
                array.add(div);
                continue;
            }else{
                div++;
            }
        }
        boolean isSquare = false;

        if(array.size() <= 1) {
            ;
        } else {
            int tmpNum = 0;
            for(int j=0; j<array.size(); j++) {

                tmpNum = array.get(j);
                boolean isMatchedOnce = false;
                for(int jj=0; jj<array.size(); jj++) {
                    if(tmpNum == array.get(jj) && !isMatchedOnce) {
                        isMatchedOnce = true;
                        continue;
                    }else if(tmpNum == array.get(jj) && isMatchedOnce) {
                        isSquare = true;
                        break;
                    } else {
                        isSquare = false;
                    }
                }
            }
        }
        if(isSquare) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
    }
}

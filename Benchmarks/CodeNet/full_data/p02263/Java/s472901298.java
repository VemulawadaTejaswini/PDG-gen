import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[] numbers = new int[100];
        int numberPlace = 0;
        String s;

        while(inp.hasNext()){
            s = inp.next();
            if (s.equals("=")){
                break;
            }
            if (s.equals("+")){
                int tempHold = numbers[numberPlace-2] + numbers[numberPlace-1];

                numbers[numberPlace-1] = 0;
                numbers[numberPlace-2] = 0;

                numberPlace -= 2;

                numbers[numberPlace] = tempHold;
            } else if (s.equals("-")){
                int tempHold = numbers[numberPlace-2] - numbers[numberPlace-1];

                numbers[numberPlace-1] = 0;
                numbers[numberPlace-2] = 0;

                numberPlace -= 2;

                numbers[numberPlace] = tempHold;
            } else if (s.equals("*")){
                int tempHold = numbers[numberPlace-2] * numbers[numberPlace-1];

                numbers[numberPlace-1] = 0;
                numbers[numberPlace-2] = 0;

                numberPlace -= 2;

                numbers[numberPlace] = tempHold;
            } else {
                numbers[numberPlace] = Integer.parseInt(s);
            }

            numberPlace++;
        }

        System.out.println(numbers[numberPlace-1]);
    }
}


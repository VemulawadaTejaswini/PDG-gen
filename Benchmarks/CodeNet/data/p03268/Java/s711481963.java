import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        int maxNumber = Integer.valueOf(inputs[0]);
        int multipleNumber = Integer.valueOf(inputs[1]);
        int baseNumber = maxNumber/multipleNumber;
        int count = baseNumber* baseNumber * baseNumber;

        if(multipleNumber%2==0) {
            int baseNumber2 = baseNumber;
            if(maxNumber%multipleNumber>=multipleNumber/2) {
                baseNumber2 = baseNumber2+1;
            }
            count = count + ( baseNumber2*baseNumber2*baseNumber2);
        }
        System.out.println(count);
    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            List<String> inputString = Arrays.asList(br.readLine().split(" "));
            int numberA = Integer.parseInt(inputString.get(0));
            int numberB = Integer.parseInt(inputString.get(1));

            int maxAbbOrSubOrMul = getMaxAbbOrSubOrMul(numberA, numberB);
            System.out.println(maxAbbOrSubOrMul);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    private static int getMaxAbbOrSubOrMul(int numberA, int numberB) {

        int add = numberA + numberB;
        int sub = numberA - numberB;
        int mul = numberA * numberB;

        if (add >= sub && add >= mul) {
            return add;
        } else if (sub >= add && sub >= mul) {
            return sub;
        } else if (mul >= add && mul >= sub) {
            return mul;
        }
        return 0;
    }
}
import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args){
        ABC160A();
    }
    private static void ABC160A() {
        // no comment, no error check
        final int INPUT_LINES_CNT = 1;
        final String DATA_SPLIT_SPACE = " ";

        ArrayList<String> inputLines = getStdInMultiLines(INPUT_LINES_CNT);

        if (inputLines.size() == 0) {
            System.out.println(0);
            return;
        }

        String outputStr;
        try {
            List<String> inputLineList= 
            Arrays.asList((inputLines.get(0)).split(DATA_SPLIT_SPACE));

            String str = inputLineList.get(0);

            if (str.substring(2,3).equals(str.substring(3,4))
                && str.substring(4,5).equals(str.substring(5,6))) {
                    outputStr = "Yes";
                }
            else {
                outputStr = "No";
            }
        }
        catch (Exception ex) {
            outputStr = "No";
        }

        System.out.println(outputStr);
        return;
    }

    private static int getStdInNum() {
        String line1 = getStdInSingleLine();
        if (isNumber(line1)) {
            return Integer.parseInt(line1);
        }
        return 0;
    }

    private static ArrayList<String> getStdInMultiLines() {
        int cnt = 0; 
        int max = 0;

        Scanner cin = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        for (;cin.hasNext();) {
            list.add(cin.nextLine());
            if (cnt++ == 0) {
                max = Integer.parseInt((list.get(0)).split(" ")[0]);
            }
            else if (cnt == max + 1) {
                break;
            }
        }
        cin.close();
        return list;
    }
    private static ArrayList<String> getStdInMultiLines(int inputLinesCnt) {
        int cnt = 0; 

        Scanner cin = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        for (;cin.hasNext();) {
            list.add(cin.nextLine());
            if (++cnt == inputLinesCnt) {
                break;
            }
        }
        cin.close();
        return list;
    }

    private static String getStdInSingleLine() {
        Scanner cin = new Scanner(System.in);

        for (;cin.hasNext();) {
            cin.close();
            return cin.nextLine();
        }

        cin.close();
        return "";
    }

    private static boolean isNumber(String val) {
        try {
            Integer.parseInt(val);
            return true;
        }
        catch (NumberFormatException nfex) {
            return false;
        }
    }

}

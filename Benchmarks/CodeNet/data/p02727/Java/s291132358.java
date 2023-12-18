import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args){
        ABC160D();
    }
    private static void ABC160D() {
        // no comment, no error check
        final int INPUT_LINES_CNT = 4;
        final String DATA_SPLIT_SPACE = " ";

        ArrayList<String> inputLines = getStdInMultiLines(INPUT_LINES_CNT);

        if (inputLines.size() == 0) {
            System.out.println(0);
            return;
        }

        String outputStr = "0";
        try {
            List<Integer> inputLineList1 = toArrayInteger(Arrays.asList((inputLines.get(0)).split(DATA_SPLIT_SPACE)));
            List<Integer> inputLineList2 = toArrayInteger(Arrays.asList((inputLines.get(1)).split(DATA_SPLIT_SPACE)));
            List<Integer> inputLineList3 = toArrayInteger(Arrays.asList((inputLines.get(2)).split(DATA_SPLIT_SPACE)));
            List<Integer> inputLineList4 = toArrayInteger(Arrays.asList((inputLines.get(3)).split(DATA_SPLIT_SPACE)));
            List<Integer> inputLineListSum = new ArrayList<Integer>();
            List<Integer> inputLineList = new ArrayList<Integer>();
            Collections.sort(inputLineList2, Comparator.reverseOrder());
            Collections.sort(inputLineList3, Comparator.reverseOrder());
            Collections.sort(inputLineList4, Comparator.reverseOrder());

            for (int i = 0; i < inputLineList1.get(0); i++){
                inputLineListSum.add(inputLineList2.get(i));
            }
            for (int i = 0; i < inputLineList1.get(1); i++){
                inputLineListSum.add(inputLineList3.get(i));
            }
            Collections.sort(inputLineListSum, Comparator.reverseOrder());
            int idx1 = 0;
            int idx2 = 0;
            int len = inputLineListSum.size();
            for (int i = 0; i < len; i++){
                if (idx2 >= inputLineList4.size() || inputLineListSum.get(idx1) >= inputLineList4.get(idx2) ){
                    inputLineList.add(inputLineListSum.get(idx1++));
                }
                else{
                    inputLineList.add(inputLineList4.get(idx2++));
                }
            }
            outputStr = String.valueOf(inputLineList.stream()
                        .mapToInt(s -> s)
                        .sum()); 
        }
        catch (Exception ex) {
            outputStr = "0";
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

      private static List<Integer> toArrayInteger(List<String> array) {
        try {
            List<Integer> list = new ArrayList<Integer>(array.size());
            for (int i = 0; i < array.size(); i++) {
                list.add(Integer.valueOf(array.get(i)));
            }
            return list;
        }
        catch (NumberFormatException nfex) {
            return new ArrayList<Integer>();
        }
    }
}

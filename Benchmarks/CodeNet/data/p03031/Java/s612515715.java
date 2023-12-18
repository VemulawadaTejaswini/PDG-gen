import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int sw = Integer.parseInt(str.split(" ")[0]);
        int lbnum = Integer.parseInt(str.split(" ")[1]);
        List<String> swStates = new ArrayList<String>((int)Math.pow(2, sw));
        List<List<Integer>> lbConnected = new ArrayList<List<Integer>>();

        for (int i = 0; i < lbnum; i++) {
            List<Integer> ls = new ArrayList<Integer>();
          	int lbConum = in.nextInt();
            for (int j = 0; j < lbConum; j++) {
                ls.add(in.nextInt());
            }
            lbConnected.add(ls);
        }
        int[] zoo = new int[lbnum];
      	int hld = 0;
        for (int i = 0; i < lbnum; i++) {
            zoo[i] = in.nextInt();
        }
        in.close();

        StringBuilder sb = new StringBuilder();
        String bins;
        for (int i = 0; i < Math.pow(2, sw); i++) {
            sb.delete(0, sb.length());
            bins = Integer.toBinaryString(i);
            for (int j = 0; j <= sw - bins.length(); j++) {
                sb.append("0");
            }
            sb.append(bins);
            swStates.add(sb.toString());
        }

        List<String> ignoreCase = new ArrayList<String>();
        for(int i = 0; i < lbnum; i++) {
            ignoreCase.clear();
            int count;
            for (String a : swStates) {
                count = 0;
                for (Integer idx : lbConnected.get(i)) {
                    if (a.charAt(sw + 1 - idx) == '1') {
                        count++;
                    }
                }
                if (count % 2 != zoo[i]) {
                    ignoreCase.add(a);
                }
            }
            swStates.removeAll(ignoreCase);
            if (swStates.size() == 0) {
                break;
            }
        }

        System.out.println(swStates.size());

    }

}

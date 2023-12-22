import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] arg) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            list.clear();
            int num = Integer.parseInt(line);
            for (int r = 0; r < num - 1; r++) {
                addContent(r + 2);
            }
            deleteNotPrimeNum(num);
            System.out.println(list.size());
        }
    }

    private static int deleteNotPrimeNum(int num) {
        int aNum;
        double sqr;
        int primeNum = 0;
        sqr = Math.sqrt(num);

        for (int i = 0; primeNum < sqr; i++) {
            primeNum = getIntVal(i);
            for (int n = i; n < list.size(); n++) {
                aNum = getIntVal(n);
                if ((aNum != primeNum) && (aNum % primeNum == 0)) {
                    deleteContent(aNum);
                    n--;
                }
            }
        }
        return primeNum;
    }

    private static ArrayList<Integer> list = new ArrayList<Integer>();

    private static void addContent(int aVal) {
        list.add(Integer.valueOf(aVal));
    }

    private static void deleteContent(int aVal) {
        list.remove(Integer.valueOf(aVal));
    }

    private static int getIntVal(int aVal) {
        return list.get(aVal).intValue();
    }
}
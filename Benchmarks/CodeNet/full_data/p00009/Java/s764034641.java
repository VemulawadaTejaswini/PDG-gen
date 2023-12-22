import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] arg) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        String line;

        while ((line = in.readLine()) != null) {
            list.clear();
            int size = Integer.parseInt(line);
            for (int r = 2; r < size + 1; r++) {
                list.add(Integer.valueOf(r));
            }

            int tgtNum;
            int primeNum = 0;
            double sqr = Math.sqrt(size);

            for (int i = 0; primeNum < sqr; i++) {
                primeNum = list.get(i).intValue();
                
                for (int n = i; n < list.size(); n++) {
                    tgtNum = list.get(n).intValue();
                    if ((tgtNum != primeNum) && (tgtNum % primeNum == 0)) {
                        list.remove(Integer.valueOf(tgtNum));
                        n--;
                    }
                }
            }
            System.out.println(list.size());
        }
    }
}
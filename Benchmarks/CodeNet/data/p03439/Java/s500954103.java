import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pprevQuery = 0;
        int prevQuery = 0;
        String prevRet = "";
        for (int i = 0; i < 20; i++) {
            int query;
            if (i == 0) {
                query = 0;
            } else if (i == 1) {
                String ret = sc.next();
                if (ret.equals("Vacant")) return;
                query = n / 2;
                prevRet = ret;
            } else {
                String ret = sc.next();
                if (ret.equals("Vacant")) return;
                else if (Math.abs(prevQuery - pprevQuery) > 1 &&
                        !ret.equals(prevRet)) {
                    query = prevQuery / 2;
                } else {
                    query = (n + prevQuery) / 2;
                }
                prevRet = ret;
            }
            prevQuery = query;
            pprevQuery = prevQuery;
            System.out.println(query);
        }
    }
 }

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.math.BigDecimal;

public class Main {
    public static Scanner sc;
    public static LinkedHashMap<String, BigDecimal> map;
    public static ArrayList<Data> list;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        
        BigDecimal bd = new BigDecimal(1000000);
        
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) break;
            
            list = new ArrayList<Data>();
            
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                BigDecimal cost = new BigDecimal(sc.nextLong() * sc.nextLong());
                
                if (list.size() == 0) {
                    list.add(new Data(s, cost));
                } else {
                    boolean b = false;
                    int t = -1;
                    for (int j = 0; j < list.size(); j++) {
                        if (list.get(j).number.equals(s)) {
                            b = true;
                            t = j;
                        }
                    }
                    if (b) {
                        BigDecimal now = list.get(t).cost;
                        list.get(t).cost = cost.add(now);
                    } else {
                        list.add(new Data(s, cost));
                    }
                }
            }
            
            boolean isShow = false;

            for (int i = 0; i < list.size(); i++) {
                String s = list.get(i).number;
                if (list.get(i).cost.compareTo(bd) >= 0) {
                    System.out.println(s);
                    isShow = true;
                } 
            }
            
            if (!isShow) {
                System.out.println("NA");
            }
        }
    }
}

class Data {
    public String number;
    public BigDecimal cost;
    public Data(String s, BigDecimal bd) {
        number = s;
        cost = bd;
    }
}
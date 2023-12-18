import java.io.*;
import java.util.*;

public class Main {
    static int k;
    static String s;

    public static void main(String[] args) throws IOException {
        BufferedReader input =
            new BufferedReader(new InputStreamReader(System.in));

        s = input.readLine();
        k = Integer.parseInt(input.readLine());
        SortedMap a = new SortedMap(k);
        int len = s.length();

        for (int i=0; i<len; i++) {
            for (int j=1; j<=k && i+j<=len; j++) {
                String ss = s.substring(i, i+j);
                if (a.getBiggest().compareTo(ss) > 0) {
                    a.put(ss);
                    //System.out.println(ss + a);
                }
            }
        }
        System.out.println(a.getBiggest());
    }
}

class SortedMap {
    int maxSize;
    ArrayList<String> list;
    SortedMap(int maxSize) {
        list = new ArrayList<String>();
        this.maxSize = maxSize;
        list.add("zzzzzzzzzzz");
    }
    
    public String getBiggest() {
        return list.get(list.size()-1);
    }
    public void put(String s) {
        for (int i=0; i<list.size(); i++) {
            String t = list.get(i);
            if (s.equals(t)) return;
            if (s.compareTo(t) < 0) {
                list.add(i, s);
                break;
            }
        }
        if (list.size() > maxSize) list.remove(maxSize);
    }
    public String toString() {
        String s = "";
        for (int i=0; i<list.size(); i++) {
            s += ":" + list.get(i);
        }
        return s;
    }
}

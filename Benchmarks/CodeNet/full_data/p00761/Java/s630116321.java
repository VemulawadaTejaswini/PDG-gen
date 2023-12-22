import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static List<String> list;
    public static void main(String[] args) throws Exception {
        while (sc.hasNext()) {
            String a = sc.next();
            int l = sc.nextInt();
            if (l == 0) break;
            list = new ArrayList<>();
            list.add(pad(a,l));
            calc(a, l);
        }
    }
    
    public static void calc(String a, int l) {
        String s = pad(a, l);
        String no = no(s);
        String ro = ro(s);
        
        String next = pad(String.valueOf(Integer.parseInt(ro) - Integer.parseInt(no)), l);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(next)) {
                System.out.println(i + " " + Integer.parseInt(next) + " " + (list.size()-i));
                return;
            }
        }
        list.add(pad(next,l));
        calc(next, l);
    }
    
    public static String pad(String a, int l) {
        int len = a.length();
        
        for (int i = len; i < l; i++) {
            a += "0";
        }
        return a;
    }
    
    public static String no(String s) {
        String[] ary = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ary[i] = s.substring(i, i+1);
        }
        Arrays.sort(ary, Comparator.naturalOrder());
        String ret = "";
        for (int i = 0; i < s.length(); i++) {
            ret += ary[i];
        }
        return ret;
    }

    public static String ro(String s) {
        String[] ary = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ary[i] = s.substring(i, i+1);
        }
        Arrays.sort(ary, Comparator.reverseOrder());
        String ret = "";
        for (int i = 0; i < s.length(); i++) {
            ret += ary[i];
        }
        return ret;
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String T = sc.nextLine();
        Map<String,String> map = new HashMap<>();
        for(int i = 0;i < T.length();i++){
            char t = T.charAt(i);
            char s = S.charAt(i);
            map.put(String.valueOf(s),String.valueOf(t));
        }
        long count = map.values().stream().distinct().count();
        long count2 = map.values().stream().count();
        println(count != count2 ? "No" : "Yes");
        return;
    }
    static long getLong(String val) {return Long.parseLong(val);}
    static int getInt(String val) {return Integer.parseInt(val);}
    static String[] split(String val) {return val.split(" ");}
    static List<String> toSortedList(String[] s){ return sortList(Arrays.asList(s));}
    static List<String> sortList(List<String> list){
        Collections.sort(list, Comparator.comparingInt(val -> Integer.parseInt(String.valueOf(val))));
        return list;
    }

    static void println(String val){System.out.println(val);}
    static void println(int val){System.out.println(val);}
    static void println(long val){System.out.println(val);}
}
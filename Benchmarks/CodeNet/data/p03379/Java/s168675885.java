import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int N = getInt(s[0]);
        String[] X = sc.nextLine().split(" ");
        String[] x = X.clone();
        Arrays.sort(x);

        // 中央値の境界を取る
        int floor = (int)Math.floor(N / 2) - 1;
        int border = getInt(x[floor]);

        int a = getInt(x[floor + 1]);
        int b = getInt(x[floor]);
        for(int i = 0;i < N;i++){
            if(getInt(X[i]) <= border){
                println(a);
            }else{
                println(b);
            }
        }

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
    static void println(boolean val){System.out.println(val);}
}

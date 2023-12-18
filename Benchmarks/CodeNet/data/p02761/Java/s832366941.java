import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        List<Integer> digits = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0;i < m;i++){
            digits.add(sc.nextInt());
            numbers.add(sc.nextInt());
        }
        System.out.println(solve(n, m, digits, numbers));
    }

    public static String solve(int n, int m, List<Integer> digits, List<Integer> numbers){
        for(int i = 0;i < 1000;i++){
            String str = String.valueOf(i);
            if(isOK(str, n, m, digits, numbers)) return str;
        }
        return "-1";
    }

    public static boolean isOK(String str, int n, int m, List<Integer> digits, List<Integer> numbers) {
        if(str.length() != n) return false;
        for (int i = 0; i < m; i++) {
            if(str.charAt(digits.get(i) - 1) != (char)((int)numbers.get(i) + '0')) return false;
        }
        return true;
    }
}
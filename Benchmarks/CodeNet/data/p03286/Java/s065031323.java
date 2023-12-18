import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
        } else {
            System.out.println(makeMinusBinary(n));
        }   
    }
    
    private static String makeMinusBinary(int n) {
        List<String> result = new ArrayList<>();
        boolean loop = true;
        while(loop) {
            int binary = n % -2;
            result.add(String.valueOf(binary));
            n = n / -2;
            if (n == 1) {
                result.add(String.valueOf(n));
                loop = false;
            }
            if (n == -1) {
                result.add(String.valueOf(-1));
                loop = false;
            }
        }
        StringBuffer sb = new StringBuffer();
        for (String s : result) {
            sb.append(s);
        }
        return sb.toString();
    }
}

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String A;
        TreeMap<String,Integer> B=new TreeMap<>();
        int max=0;
        int count;
        for (int i = 0; i < N; i++) {
            A = sc.next();
            if (B.containsKey(A)) {
                count=B.get(A)+1;
                B.put(A, count);
            }else{
                B.put(A, 1);
            }
            max=Math.max(B.get(A), max);
        }

        //System.out.println(B.toString());

        for (String str : B.keySet()) {
            if (B.get(str)==max) {
                System.out.println(str);
            }
        }
    }
}
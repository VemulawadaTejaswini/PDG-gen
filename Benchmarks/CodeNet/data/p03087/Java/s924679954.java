import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer N = sc.nextInt();
        Integer Q = sc.nextInt();
        String S = sc.next();

        Integer[] l = new Integer[Q], r = new Integer[Q];
        for(int i = 0; i < Q; i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        for(int i = 0; i < Q; i++){
            Integer count = 0;
            for(int idx = l[i]; idx < r[i]; idx++){
                if(S.charAt(idx-1) == 'A' && S.charAt(idx) == 'C'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] w = sc.next().toCharArray();
        int n = w.length;
        int s0 = 0;
        int s1 = 0;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0 && w[i] == '1' || i % 2 != 0 && w[i] == '0'){
                s0++;
            }
        }
        for(int i = 0; i < n; i++){
            if(i % 2 != 0 && w[i] == '1' || i % 2 == 0 && w[i] == '0'){
                s1++;
            }
        }
        System.out.println(Math.min(s0,s1));
    }
}

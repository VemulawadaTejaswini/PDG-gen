import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        int[] preChildren = new int[N];
        int[] nextChildren = new int[N];
        for (int i=0; i<N; i++) {
            preChildren[i] = 1;
            nextChildren[i] = 1;
        }
        for (int i=0; i<100000; i++) {
            for (int j=0; j<N; j++) {
                char s = S.charAt(j);
                if (s == 'R') {
                    nextChildren[j+1] += preChildren[j];
                    nextChildren[j] -= preChildren[j];
                } else {
                    nextChildren[j-1] += preChildren[j];
                    nextChildren[j] -= preChildren[j];
                }
            }
            preChildren = nextChildren.clone();
        }
        for (int i=0; i<N; i++) {
            System.out.print(nextChildren[i]);
            System.out.print(" ");
        }
    }
}
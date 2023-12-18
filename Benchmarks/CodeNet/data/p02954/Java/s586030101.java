import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        int[] prepreChildren = new int[N];
        int[] preChildren = new int[N];
        int[] nextChildren = new int[N];
        for (int i=0; i<N; i++) {
            preChildren[i] = 1;
            nextChildren[i] = 1;
        }
        for (int i=0; i<100000; i++) {
            for (int j=0; j<N; j++) {
                if (S.charAt(j) == 'R') {
                    nextChildren[j+1] += preChildren[j];
                    nextChildren[j] -= preChildren[j];
                } else {
                    nextChildren[j-1] += preChildren[j];
                    nextChildren[j] -= preChildren[j];
                }
            }
            if(Arrays.equals(nextChildren, prepreChildren) && i % 2 == 1) {
                break;
            }
            prepreChildren = preChildren;
            preChildren = nextChildren.clone();
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<N; i++) {
            sb.append(nextChildren[i]);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
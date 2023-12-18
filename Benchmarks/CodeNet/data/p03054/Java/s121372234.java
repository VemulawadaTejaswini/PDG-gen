import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        int N = Integer.parseInt(sc.next());
        int s1 = Integer.parseInt(sc.next());
        int s2 = Integer.parseInt(sc.next());
        sc.nextLine();
        char[] S = sc.nextLine().toCharArray();
        char[] T = sc.nextLine().toCharArray();
        int count = 0 ;
        for (int i = 0; i<N;i++){
            if (S[i] == 'L') {
                if (s2-1<=W-s1) s2--;
            } else if (S[i] == 'R') {
                if (W-(s2+1)<= s1) s2++;
            } else if (S[i] == 'U') {
                if (s1-1 <= H-s1) s1--;
            } else if(S[i] == 'D') {
                if (H-s1-1<= s1) s1++;
            }
//            System.out.println("S: ( "+s1 +" , " + s2 + " )");
            if (s1<1 || s1>H || s2<1 || s2>W){
                System.out.println("NO");
                break;
            }
            if (T[i] == 'L') {
                if (s2-1>=W-s1) s2--;
            } else if (T[i] == 'R') {
                if (W-(s2+1)>= s1) s2++;
            } else if (T[i] == 'U') {
                if (s1-1>=H-s1) s1--;
            } else if(T[i] == 'D') {
                if (H -s1-1>= s1) s1++;
            }
//            System.out.println("T: ( "+s1 +" , " + s2 + " )");
            count++;
        }
        if (count==N)
            System.out.println("YES");
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] Ss = new int[M];
        int[] Cs = new int[M];
        for (int m = 0; m < M; m++){
            Ss[m] = sc.nextInt();
            Cs[m] = sc.nextInt();
        }
//        System.out.println("\n\n");
//        for (int m = 0; m < M; m++){
//            System.out.println(Ss[m]+" "+Cs[m]);
//        }
        int[] text = new int[N];
        int noFlg = 0;
        for (int m = 0; m < M; m++){
//            System.out.println(Cs[m]+ "");
            if ((text[Ss[m]-1] != 0) && (text[Ss[m]-1] != Cs[m])) {
                noFlg = 1;
                break;
            }
            text[Ss[m]-1] = Cs[m];
        }
        StringBuilder sb = new StringBuilder();
        for (int t: text) {
//            System.out.println(t);
            sb.append(String.valueOf(t));
        }
        if (noFlg == 1) System.out.println("-1");
        else System.out.println(sb.toString());
    }
}

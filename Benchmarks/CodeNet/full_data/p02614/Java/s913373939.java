import java.util.Scanner;

//解説を参考した
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int H = sc.nextInt();
        final int W = sc.nextInt();
        final int K = sc.nextInt();

        String[] s = new String[H];

        for(int i = 0; i < H; i++) s[i] = sc.next();

        int ans = 0;
        for (int is = 0; is < (1 << H); is++) {
            for (int js = 0; js < (1 << W); js++) {

                int count = 0;
                for (int i = 0; i < H; i++) {
                    for (int j = 0; j < W; j++) {
                        //マスが消されているならcontinueする
                        if (((is >>> i) & 1) > 0)
                            continue;
                        if (((js >>> j) & 1) > 0)
                            continue;
                        if (s[i].charAt(j) == '#')
                            ++count;
                    }
                }
                if (count == K) ++ans;

            }
        }

        System.out.println(ans);
    }

}

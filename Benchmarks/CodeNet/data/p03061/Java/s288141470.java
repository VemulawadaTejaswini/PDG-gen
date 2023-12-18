import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] Ai = new int[N];
        int[] Aiの最大の約数 = new int[N];
        List<ArrayList<Integer>> AiList = new ArrayList<>();
        List<Integer> GreatestCommonDivisorList = new ArrayList<>();
        int 最大公約数1以上カウント = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {

            Ai[i] = sc.nextInt();
        }

        if ( N == 2) {

            if (Ai[0] >= Ai[1]) {

                System.out.println(Ai[0]);

                sc.close();
                System.exit(0);
            } else {

                System.out.println(Ai[1]);
                sc.close();
                System.exit(0);
            }
        }


        //Aiごとに1以外の約数を算出
        for (int i = 0; i < N; i++) {

            ArrayList<Integer> factoring = new ArrayList<>();

            for(int n = 2; n-1 < Ai[i]; n++) {

                if(Ai[i] % n == 0) {

                    factoring.add(n);
                }
            }
            Aiの最大の約数[i] = Collections.max(factoring);
            AiList.add(factoring);
        }
// ---------ここまでok

        //NC2回の全ての組み合わせに対して最大公約数をListに格納
        //Nが4以上の場合の最大公約数の値がおかしい
        for (int hoge = 0; hoge < N-1; hoge++) {

            Integer GreatestCommonDivisor = 0;

            for (int foo = hoge+1; foo < N; foo++) {

                for (int n  = 0;  n  < AiList.get(hoge).size(); n++) {

                    for (int f = 0; f < AiList.get(foo).size(); f++) {

                        if(AiList.get(hoge).get(n).equals(AiList.get(foo).get(f))) {

                            if (AiList.get(hoge).get(n) > GreatestCommonDivisor) {
                                GreatestCommonDivisor = AiList.get(hoge).get(n);
                            }

                        }
                        if(GreatestCommonDivisor > 1) {

                            最大公約数1以上カウント++;
                        }
                        GreatestCommonDivisorList.add(GreatestCommonDivisor);
                    }
               }



            }

        }

        //GreatestCommonDivisorListのsizeと最大公約数がない場合に応じてansを出力
        if (最大公約数1以上カウント == 0) {

            System.out.println(1);
        } else {

            for (int i = 0; i < GreatestCommonDivisorList.size(); i++) {

                if (max < GreatestCommonDivisorList.get(i)) {

                    int  max2 = GreatestCommonDivisorList.get(i);

                    for (int n = 0; n < N; n++) {

                        if (Aiの最大の約数[n] < max2 ) {

                        	System.out.println(max);
                        	sc.close();
                        	System.exit(0);
                        }
                    }

                    max = max2;
                }
            }

            System.out.println(max);
        }

        sc.close();
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] Ai = new int[N];
        List<ArrayList<Integer>> AiList = new ArrayList<>();
        List<Integer> GreatestCommonDivisorList = new ArrayList<>();
        int notMatch = 0;

        for (int i = 0; i < N; i++) {

            Ai[i] = sc.nextInt();
        }

        //Aiごとに約数を算出
        for (int i = 0; i < N; i++) {

            ArrayList<Integer> factoring = new ArrayList<>();

            for(int n = 1; n-1 < Ai[i]; n++) {

                if(Ai[i] % n == 0) {

                    factoring.add(n);
                }
            }

            AiList.add(factoring);
        }
// ---------ここまでok

        //NC2回の全ての組み合わせに対して最大公約数をListに格納
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
                    }

                GreatestCommonDivisorList.add(GreatestCommonDivisor);


                }

                if(GreatestCommonDivisor.equals(1)) {

                    notMatch++;
                }

            }

        }

        //GreatestCommonDivisorListのsizeと最大公約数がない場合に応じてansを出力
        if (notMatch >= 2) {

            System.out.println(1);
        } else if ( N == 2) {

            if (Ai[0] >= Ai[1]) {

                System.out.println(Ai[0]);
            } else {

                System.out.println(Ai[1]);
            }
        } else {

            int max = 0;

            for (int i = 0; i < GreatestCommonDivisorList.size(); i++) {

                if (max < GreatestCommonDivisorList.get(i)) {

                    max = GreatestCommonDivisorList.get(i);
                }
            }

            System.out.println(max);
        }

        sc.close();
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt( in.nextLine() );
        int[][] enemies = new int[n][n-1];
        int[] currents = new int[n];
        boolean[] isMatcheds = new boolean[n];
        for( int i = 0 ; i < n ; i++ ){
            String[] params = in.nextLine().split(" ");
            for( int j = 0 ; j < n - 1 ; j++ ){
                enemies[i][j] = Integer.parseInt(params[j]) - 1;
            }
            currents[i] = 0;
            isMatcheds[i] = false;
        }

        int count = 0;
        // 日単位のループ
        while (true ){

            for( int i = 0 ; i < n ; i++ ){

                // 既に対戦が終了していた場合はcontinue
                if( currents[i] == n - 1 ){
                    continue;
                }

                // 対戦相手配列index
                int enemyIndex = enemies[i][currents[i]];

                // 既にどちらかが対戦済みなら次の対戦相手のチェックへ
                if( isMatcheds[i] || isMatcheds[enemyIndex] ){
                    continue;
                }

                // 対戦相手とマッチングしたらマッチしたこと、次の対戦相手の情報へ
                if( i == enemies[enemyIndex][currents[enemyIndex]] ){
                    isMatcheds[i] = true;
                    isMatcheds[enemyIndex] = true;
                    currents[i]++;
                    currents[enemyIndex]++;
                }
            }

            count++;

            // 全てのメンバーが最後まで試合できていれば終了
            boolean isEnd = true;
            // 当日全てのメンバーがマッチできなければ-1
            boolean isMatched = false;
            for( int i = 0 ; i < n ; i++ ){
                if( currents[i] != n - 1 ){
                    isEnd = false;
                }
                if( !isMatched && isMatcheds[i] ) {
                    isMatched = true;
                }
                isMatcheds[i] = false;
            }

            if( isEnd ){
                System.out.println( count );
                return;
            }
            if( !isMatched ){
                System.out.println( -1 );
                return;
            }

        }


    }

}

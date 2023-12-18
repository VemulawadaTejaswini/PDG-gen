import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        String s = sc.next();

        char[] t = new char[Q];
        char[] d = new char[Q];

        for(int i=0; i<Q; i++){
            t[i] = sc.next().charAt(0);
            d[i] = sc.next().charAt(0);
        }

        sc.close();

        char[] c = s.toCharArray();

        int[] golems = new int[N];
        for(int i=0; i<N; i++){
            golems[i] = 1;
        }

        //debug
        for(int f=0; f<N; f++){
            System.err.print(golems[f]);
        }
        System.err.println();

        for(int i=0; i<Q; i++){ //呪文
            int about = t[i]; //移動対象マス
            for(int j=0; j<N; j++){ //マス
                char tmp = c[j]; //マスの文字
                if(tmp == about && golems[j] != 0){ //文字一致
                    int golemCount = golems[j];
                    golems[j] = 0;
                    if(d[i] == 'L' && j != 0){
                        golems[j-1] += golemCount;
                    }else if(d[i] == 'R' && j != N-1){
                        golems[j+1] += golemCount;
                    }
                }
            }

            //debug
            for(int f=0; f<N; f++){
                System.err.print(golems[f]);
            }
            System.err.println();

        }

        int count = 0;

        for(int i=0; i<N; i++){
            count += golems[i];
        }

        System.out.println(count);

    }
}
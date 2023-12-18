import java.util.*;

class Main{
    int N;
    long D,A;
    long[][] enemy;

    public static void main(String args[]) throws Exception{
        Main main = new Main();
    }

    public Main(){
        Scanner scanner = new Scanner(System.in);
        N = Integer.parseInt(scanner.next());
        D = Long.parseLong(scanner.next());
        A = Long.parseLong(scanner.next());

        enemy = new long[N][2];
        for(int i=0;i<N;i++){
            enemy[i][0] = Long.parseLong(scanner.next());
            enemy[i][1] = Long.parseLong(scanner.next());
        }
        Arrays.sort(enemy, (a,b)->(int)(a[0]-b[0]));

        long number, d, total = 0L;
        int end=1;
        for(int f=0;f<N;f++){
            if(enemy[f][1]<=0) continue;

            number = (enemy[f][1] + A - 1)/A;
            total += number;
            d = enemy[f][0] + D*2L;

            while(end<N && enemy[end][0]<=d){
                enemy[end][1] -= number*A;
                end++;
            }
        }

        System.out.println(total);
    }
}

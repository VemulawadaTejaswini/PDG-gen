import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dice = sc.nextInt();
        int k = sc.nextInt();
        int score = (int)(Math.random()*dice+1);
        int cnt = 0;
        int sum = score;
        double coin = 1;

        while(sum <= k){
            sum *= 2;
            cnt++;
        }

        for(int i = 1;i <= cnt;i++){
            coin *= 0.5;
        }

        System.out.println(1.0/dice*coin);
    }
}
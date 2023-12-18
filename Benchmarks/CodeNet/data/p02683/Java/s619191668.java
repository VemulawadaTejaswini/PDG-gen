import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scan;
        int N;
        int M;
        int X;
        int Na;
        int yenSum;
        int scoreSum;
        int score;

        scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();
        X = scan.nextInt();

        for(int count =0; count > N ;count ++){
            Na = scan.nextInt();
            for (int num =0; num>M; num ++){
                scan = new Scanner(System.in);
                score = scan.nextInt();
                scoreSum = scoreSum + score;
                if (scoreSum <= X) {
                    yenSum = yenSum + Na;
                }else{
                }

            }
        }
        System.out.println(yenSum);
    }

}
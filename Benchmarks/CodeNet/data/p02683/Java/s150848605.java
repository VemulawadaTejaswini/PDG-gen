import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scan;
        int N;
        int M;
        int X;
        int Na;
        int Nb;
        int Nc;
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
                Nb = Nb + score;
                if (scoreSum <= X) {
                    Nc = Nc + Na;
                }else{
                }
            }
            
        }
        System.out.println(Nc);
    }

}
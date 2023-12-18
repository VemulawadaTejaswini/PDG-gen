import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextInt();
        double K = sc.nextInt();
        double Kotae = 0;
        // iは目の数
        double X = 1/N;
        for(int i=1;i<N+1;i++){
            System.out.println(i);
            int Nanjo = 0;
            for(int j=1;j<K;j++){
                i = i*2;
                if(i>=K){
                    Nanjo = j;
                    Kotae = Kotae + (X*(Math.pow(0.5,Nanjo)));
                    break;
                }
            }
        }
        System.out.println(Kotae);
    }
}
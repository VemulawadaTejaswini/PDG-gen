import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int X[] = new int[N];
        int sum = 0;

        for(int i=0;i<N;i++){
            X[i] = sc.nextInt();
            sum += X[i];
        }
        sc.nextLine();
        
        int ave = sum/2;
        double hp_all = 0;
        for(int i=0;i<N;i++){
            hp_all = Math.pow(X[i] - ave, 2);
        }
        System.out.println(hp_all);
    }
}
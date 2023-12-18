import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        ArrayList<Double> dice = new ArrayList<Double>(n);
        double result = 0;//期待値の合計
        double max = 0;
        int pt = 0;

        for(int i = 0; i < n; i++) dice.add(scan.nextDouble());
        scan.close();

        for(int j = 0; j < n-(k-1);j++){
            double sum = 0;
            for(int l = 0; l < k;l++) sum += dice.get(j + l);
            if(sum > max){max = sum; pt = j;}
        }

        for(int m = 0;m < k;m++){
            result += fac(dice.get(pt+m)) / dice.get(pt+m);
        }

        System.out.println(result);
    }

    private static double fac(double n){
        if(n == 1) return 1;
        else return n * fac(n-1);
    }
}
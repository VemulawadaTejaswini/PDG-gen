import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();
        int[] ap = new int[N];
        int[] aji = new int[N];
        int sumall = 0;
        int sumsub = 0


        for(int i = 0;i < N;i++){
            aji[i] = L + i - 1;
        }

        Arrays.sort(aji);
        for(int i = 0;i < N;i++){
            sumall += aji[i];
            sumsub += aji[i];
        }
        sumsub -= aji[0];
        System.out.println(sumsub);
    }
}
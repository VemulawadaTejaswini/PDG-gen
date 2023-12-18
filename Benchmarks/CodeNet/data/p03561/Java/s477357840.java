import java.util.*;

public class Main{

    private void print(int[] arrayMid){
        StringBuilder Mid = new StringBuilder();
        for(int i = 0; i < arrayMid.length; i++){
            Mid.append(arrayMid[i] + " ");
        }
        System.out.print(Mid);
    }

    private void Even(int K, int N){
        int[] arrayMid = new int[N];
        arrayMid[0] = K/2;
        for(int i = 1; i < N; i ++){
            arrayMid[i] = K;
        }
        print(arrayMid);
    }

    private void Odd(int K, int N){
        int[] arrayMid = new int[N];
        for(int i = 0; i < N; i ++){
            arrayMid[i] = (K + 1) / 2;
        }
        for(int i = 0; i < N / 2; i ++){
            if(arrayMid[arrayMid.length - 1] == 1) arrayMid = Arrays.copyOf(arrayMid, arrayMid.length - 1);
            else arrayMid[arrayMid.length - 1] --;
        }
        print(arrayMid);
    }

    private void Judge(int K, int N){
        if(K % 2 == 0) Even(K, N);
        else Odd(K, N);
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int[] in = new int[2];
        for(int i = 0; i < 2; i++){
            in[i] = input.nextInt();
        }
        Main myEncyclopedia = new Main();
        myEncyclopedia.Judge(in[0], in[1]);
        input.close();

    }
}
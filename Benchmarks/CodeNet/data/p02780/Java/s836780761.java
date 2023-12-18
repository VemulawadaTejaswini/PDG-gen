import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner str = new Scanner(System.in);
        int N = str.nextInt();
        int K = str.nextInt();

        float NList[] = new float[N];
        for(int i = 0; i < N; i++){
            NList[i] = str.nextFloat();
        }

        for(int i = 0; i < N; i++){
            NList[i] = (NList[i] + 1) / 2;
        }

        float tmp = 0;
        float Ktmp = 0;
        for(int i = 0; i < K; i++){
            tmp += NList[i];
        }

        for(int i = 0; i < N - K; i++){
            Ktmp = tmp - NList[i] + NList[i + K];
            if(Ktmp > tmp){
                tmp = Ktmp;
            }
        }

        System.out.println(tmp);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int[] x;
        x = new int[100];
        int N = sc.nextInt();

        for(int i = 0;i<N;i++){
            x[i] = sc.nextInt();
        }

        for(int i = N-1;i>0;i--){
            for(int j = 0;j<i;j++){
                if(x[j]>x[j+1]){
                    int temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                    count++;
                }
            }
        }

        for(int i = 0;i<N-1;i++){
            System.out.print(x[i] + " ");
        }
        System.out.println(x[N-1]);
        System.out.println(count);
    }
}


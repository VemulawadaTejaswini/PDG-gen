import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] d = new int[N];
        int i = 0;
        while(i < N){
            d[i] = sc.nextInt();
            i++;
        }
        int[] flag = new int[100];
        for(int j = 0; j < N; j++){
            flag[d[j] - 1]++;
        }
        int count = 0;
        for(int f: flag){
            if(f > 0){
                count++;
            }
        }
        System.out.println(count);
    }
}

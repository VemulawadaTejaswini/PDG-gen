import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int i ,j ,count = 0 ,a;
        int array[] = new int[N];

        for(i = 0;i < N;i++){
            array[i] = sc.nextInt();
        }

        for(i = N - 1;i > 0;i--){
            for(j = N - 1;j >= N - i;j--){
                if(array[j] < array[j-1]){
                    a = array[j];
                    array[j] = array[j-1];
                    array[j-1] = a;
                    count++;
                }
            }
        }

        for(i = 0;i < N;i++){
            if(i <= N-2){
                System.out.printf("%d ",array[i]);
            }else{
                System.out.printf("%d\n",array[i]);
            }
        }

        System.out.printf("%d\n",count);

    }
}

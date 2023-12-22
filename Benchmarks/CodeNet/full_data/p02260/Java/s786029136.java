import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int i ,j ,minj ,count=0 ,a;
        int array[] = new int[N];

        for(i = 0;i < N;i++){
            array[i] = sc.nextInt();
        }

        for(i = 0;i < N;i++){
            minj = i;
            for(j = i;j < N;j++){
                if(array[j] < array[minj]){
                    minj = j;
                }
            }
            if(i != minj){
                count++;
                a = array[i];
                array[i] = array[minj];
                array[minj] = a;
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

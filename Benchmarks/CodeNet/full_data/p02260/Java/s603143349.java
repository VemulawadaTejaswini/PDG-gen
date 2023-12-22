import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N];
        int count = 0;

        for(int i = 0; i < N; i++){
            array[i] = scan.nextInt();
        }

        for(int i = 0; i <= N-1; i++){
            int minj = i;
            for(int j = i; j <= N-1; j++){
                if(array[j] < array[minj]){
                    minj = j;
                }
                }

                if(array[minj] < array[i]){
                    int temp = array[i];
                    array[i] = array[minj];
                    array[minj] = temp;
                    count++;
                }
            }

        for(int i= 0; i < array.length; i++){
        System.out.print(array[i]);
        if(i < array.length-1){
            System.out.print(" ");
        } else {
            System.out.println();
            System.out.println(count);
            }
        }
    }
}

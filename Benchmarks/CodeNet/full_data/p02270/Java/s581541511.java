import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[k];
        int input = 0;
        for(int i = 0; i < n; i++){
            input = sc.nextInt();
            int minIndex = 0;
            for(int j = 1; j < k; j++){
                if(array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            array[minIndex] += input;
        }
        
        int max = array[0];
        for(int i = 0; i < k; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        
        System.out.println(max);
    }
} 

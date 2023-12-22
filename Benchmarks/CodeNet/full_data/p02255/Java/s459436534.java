import java.util.Scanner;

public class Main {
    public static void output(int array[]){
        int k;
        for(k = 0; k < array.length - 1; ++k) System.out.print(array[k] + " ");
        System.out.println(array[k]);
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int i, j, k, key, n = scanner.nextInt();
        int[] array = new int[n];
        for(i = 0; i < n; ++i) array[i] = scanner.nextInt();

        for(i = 1; i < array.length; ++i){
            output(array);
            key = array[i];
            j = i - 1;
            while(j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        output(array);
        scanner.close();
    }
}

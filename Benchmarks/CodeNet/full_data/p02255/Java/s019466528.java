import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = scan.nextInt();
        }
        for(int i = 0; i < array.length; i++){
            int idx = i;

            while(idx > 0 && array[idx-1] > array[idx]){
                int tmp = array[idx-1];
                array[idx-1] = array[idx];
                array[idx] = tmp;
                idx--;

            }
            show(array);
        }

    }
    public static void show(int[] array){
        int i;
        for(i = 0; i < array.length-1; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(array[i]);


    }

}

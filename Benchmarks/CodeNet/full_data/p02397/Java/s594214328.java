import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int[] array_a = new int[3000];
        int[] array_b = new int[3000];
        int i;
        for(i = 0; (a != 0) || (b != 0); i++){
            array_a[i] = a;
            array_b[i] = b;
            a = scan.nextInt();
            b = scan.nextInt();
        }

        int j;
        for(j = 0; j < i; j++){
            sort_and_print(array_a[j], array_b[j]);
        }
    }

    public static void sort_and_print(int a, int b){
        int tmp;
        if(a > b){
            tmp = a;
            a = b;
            b = tmp;
        }

        System.out.println(a + " " + b);
    }
}


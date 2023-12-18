import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a[] = new long[6];
        long min = 0;
        long sum = 0;

        for (int i = 0; i < 6; i++) {
            a[i] = scan.nextInt();
        }

        min = a[0];


        for(int i = 1; i < 6 ; i++){
            if((a[i] <= min) ){
                min = a[i];
            }
        }

        sum = 5 + ((a[0] + min - 1)/min) -1 ;
        System.out.println(sum);

    }
}
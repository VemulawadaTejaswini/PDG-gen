import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];
        int min = 0;
        int minsize = 9;
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            a[i] = scan.nextInt();
            b[i] = a[i] % 10;
            c[i] = a[i] / 10;
            if((b[i] <= minsize) && (b[i] != 0)){
                min = i;
                minsize = b[i];
            }
        }

        for(int x = 0; x < min ; x++){

            if(b[x] != 0 ){
                c[x] = c[x] + 1;
            }
            sum = c[x]*10 + sum;
        }

        for(int y = (min + 1) ; y < 5 ; y++){

            if(b[y] != 0 ){
                c[y] = c[y] + 1;
            }
            sum = c[y]*10 + sum;
        }

        sum = sum + c[min]*10 + b[min];
        System.out.println(sum);

    }
}
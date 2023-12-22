import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = 1 ,i = 1;

        while(true){
            i++;
            if((i * 3) > n)break;
            x = i * 3;
            System.out.printf(" %d",x);
        }

        System.out.printf("\n");

    }
}

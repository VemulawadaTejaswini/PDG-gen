import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int num = sc.nextInt();
            int sum = 0,dig;

            if(num == 0)break;

            while(num > 0){
                dig = num % 10;
                sum = sum + dig;
                num = num / 10;
            }

            System.out.printf("%d\n",sum);
        }
    }
}

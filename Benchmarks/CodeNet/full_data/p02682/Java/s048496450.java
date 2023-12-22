import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int k = input.nextInt();
        int sum = 0;
        if(k<=a){
            sum += k;
        }else{
            sum += a;
            int k2 = k-a;
            if(k2<=b){
                sum += 0;
            }else{
                sum -= k2-b;
            }
        }

        System.out.println(sum);

    }
}
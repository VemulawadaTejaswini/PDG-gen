import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int x;
        int sum;
        while(true){
            x = scanner.nextInt();
            if(x == 0)break;
            sum = 0;
            while(x != 0){
                sum += x%10;
                x /= 10;
            }
            System.out.println(sum);
        }

    }
}


import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int x = sc.nextInt();

            if(x==0){
                break;
            }

            int answer=0;
            while(true){
                if(x==0){
                    break;
                }
                answer += x % 10;
                x = x / 10;
            }
            System.out.printf("%d\n",answer);
        }
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int number = 7%k;
        System.out.println(1e7);
        for (int i = 1 ; i < 1e7 ; i++){
            if (number==0){
                System.out.println(i);
                return;
            }
            number = (number*10+7)%k;
        }
        System.out.println(-1);
    }

}

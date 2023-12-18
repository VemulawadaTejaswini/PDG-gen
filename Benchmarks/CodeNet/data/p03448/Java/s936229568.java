import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coins = {500, 100, 50};
        int[] coin = new int[3];

        coin[0]=scanner.nextInt();
        coin[1]=scanner.nextInt();
        coin[2]=scanner.nextInt();
        int sum = scanner.nextInt();

        int count=0;
        for(int i=0;i<=coin[0];i++){
            for(int j=0;j<=coin[1];j++){
                for(int k=0;k<=coin[2];k++){
                    if((coins[0]*i + coins[1]*j + coins[2]*k)==sum){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
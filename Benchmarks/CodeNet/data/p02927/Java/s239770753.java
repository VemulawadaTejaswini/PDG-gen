import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int M = scan.nextInt();
        final int D = scan.nextInt();
        scan.close();
        int result = 0;
        for(int i = 1; i <= M; i++){
            for(int j = 22; j <= D; j++){
                if(j % 10 >= 2 && j / 10 >= 2 && 
                    ((j % 10) * (j / 10) == i)){
                        result++;
           }
            }
        }
        System.out.println(result);
    }
}
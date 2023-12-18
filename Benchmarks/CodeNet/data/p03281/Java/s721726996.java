import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();

        int counter = 0;
        for(int i=1; i<=n; i++){
            if(i % 2 == 0){
                continue;
            }

            int factor = 0;

            if(i % 3 == 0){
                factor++;
            }
            if(i % 5 == 0){
                factor++;
            }
            if(i % 7 == 0){
                factor++;
            }
            if(i % 11 == 0){
                factor++;
            }
            if(i % 13 == 0){
                factor++;
            }

            if(factor == 3){
                counter++;
            }
        }

        System.out.println(counter);
    }
}
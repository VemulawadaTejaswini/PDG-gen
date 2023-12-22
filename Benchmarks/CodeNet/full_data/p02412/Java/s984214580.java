import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n, x;
        int count = 0;
        while(true){
            n = scanner.nextInt();
            x = scanner.nextInt();
            if(n == 0 && x == 0){
                break;
            }
            count = 0;
            for(int a = n; a > 0; a--){
                for(int b = n; b > 0; b--){
                    for(int c = n; c > 0; c--){
                        if(x == (a+b+c) && a != b && b != c && c != a){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count/6);
        }


        scanner.close();
    }
}


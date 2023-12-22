import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a,b;
        for(int i = 0; i < 3_000; i++){
            a = scanner.nextInt();
            b = scanner.nextInt();

            if(a == 0 && b == 0){
                break;
            }else if(a >= b){
                System.out.println(a + " " + b);
            }else{
                System.out.println(b + " " + a);
            }
        }
        scanner.close();
    }
}


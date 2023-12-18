import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        int count = 0;

        for(int i=0;i<2;i++){
            if (A > B){
                count += A;
                A--;
            }else{
                count += B;
                B--;
            }
        }

        System.out.println(count);

//        System.out.println(System.currentTimeMillis() - startTime);
    }
}
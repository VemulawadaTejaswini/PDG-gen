import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        Integer intX = scan.nextInt();
        scan.close();

        for(long i = -120; i <= 120; i++){
            for(long j = -120; j <= 120; j++){
                if(intX == i*i*i*i*i - j*j*j*j*j){
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String line = sc.next();

        String[] lines = line.split("");

        if(lines.length > K){
            for(int i = 0; i < K; i++){
                System.out.print(lines[i]);
            }
            System.out.print("...");
//            System.out.println();
        }else{
            System.out.println(line);
        }
    }
}

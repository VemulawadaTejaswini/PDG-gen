
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        if (N ==x){
            System.out.println("Yes");
            int tmp = 2*N;
            for(int i=1;i<tmp;i++) {
                System.out.println(i);
            }
        }
        else{
            System.out.print("No");
        }

        sc.close();

    }

 }

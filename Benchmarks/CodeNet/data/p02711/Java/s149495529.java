import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int a = N / 100;
        N = N - a * 100;
        int b = N / 10;
        N = N - b * 10;
        int c = N;

        if(a==7 || b==7 ||c==7){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
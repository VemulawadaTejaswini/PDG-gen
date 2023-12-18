import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int N = scanner.nextInt();
        int m = 0;
        int L = String.value0f(N).length();
        for(int i = 1; i <= L; i++){
            int n = N % 10;
            m = m + n;
            if(N % m == 0){
                System.out.print("Yes");
            } else {
                System.out.println("No");
            }

        }
    }

}
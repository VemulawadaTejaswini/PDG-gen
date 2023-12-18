import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = String.valueOf(N);
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += Integer.parseInt(s.substring(i, i+1));
        }

        if(N % sum == 0) System.out.println("Yes");
        else System.out.println("No");
        sc.close();
    }

}

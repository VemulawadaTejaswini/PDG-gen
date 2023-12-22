import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        String input = stdIn.nextLine();
        int n = Integer.parseInt(input);
        input = stdIn.nextLine();
        long[] a = new long[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = Integer.parseInt(input.split(" ")[i]);
        }
        long x = 0;

        for(int i = 0 ; i < n - 1 ; i++){
            for(int j = i + 1 ; j < n ; j++){
                x = x +  (a[i] * a[j]);
            }
        }
        System.out.println(x);
    }
}

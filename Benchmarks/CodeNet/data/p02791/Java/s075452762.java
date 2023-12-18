import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int min = in.nextInt();
        int count = 1;
        for(int i=1; i<n; i++) {
            int p = in.nextInt();
            if(p<min) {
                count++;
                min = p;
            }
        }
        System.out.println(count);
    }
}

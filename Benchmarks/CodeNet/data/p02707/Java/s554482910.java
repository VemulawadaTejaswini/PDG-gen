import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] count = new int[N];
        while(in.hasNext()) {
            count[in.nextInt() - 1]++;
        }
        for(int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
    }
}

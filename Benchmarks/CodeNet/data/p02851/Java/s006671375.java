import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++){
            l[i] = in.nextInt();
        }
        int c = 0;
        for (int i = 0; i < n; i++){
            int r = 0;
            int e = 0;
            for (int j = i; j < n; j++){
                r += l[j];
                r = r % k;
                if (r == ++e){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}

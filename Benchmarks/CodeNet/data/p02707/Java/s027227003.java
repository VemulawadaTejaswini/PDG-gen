import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] b = new int[n+1];
        for(int i = 2; i <= n; i++){
            int a = Integer.parseInt(sc.next());
            b[a]++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            sb.append(b[i]).append(System.lineSeparator());
        }
        System.out.print(sb);
    }
}
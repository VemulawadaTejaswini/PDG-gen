import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] people = new int[n];
        for (int i = 1; i <= n; i++) {
            people[sc.nextInt()-1] = i;
        }
        StringBuilder sb = new StringBuilder();
        for(int i : people){
            sb.append(i);
            sb.append(" ");
        }
        sb.deleteCharAt(2*n-1);
        System.out.println(sb.toString());
    }
}
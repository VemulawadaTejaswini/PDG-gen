import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int n = sc.nextInt();
        for (int i = 3; i <= n; i++) {
            if (i%3 == 0) {
                sb.append(" ").append(i);
            } 
            else  {
                int j = i;
                while (j != 0) {
                    if (j%10 == 3) {
                        sb.append(" ").append(i);
                        break;
                    }
                    j /= 10;
                }
            }
        }
        System.out.println(sb);
    }
}
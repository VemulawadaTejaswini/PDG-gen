import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();int result=0;
        String s = sc.next();
        char[] array = s.toCharArray();
        for (int i = 0; i <= n-3; i++) {
            if(array[i]=='A') {
                if (array[i + 1] == 'B') {
                    if (array[i + 2] == 'C')
                        result++;
                }
            }
        }
        System.out.println(result);
    }
}
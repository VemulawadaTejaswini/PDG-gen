import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int s = scanner.nextInt();
        int[] funcAns = new int[100010];
        boolean twice = false;
        funcAns[0] = s;
        int i = 1;
        int ans = 0;
        while(!twice) {
            funcAns[i] = func(funcAns[i-1]);
            for(int j = i - 1; j > 0; j--) {
                if(funcAns[i] == funcAns[j]) {
                    ans = i + 1;
                    twice = true;
                }
            }
            i++;
        }
        System.out.println(ans);
    }
    public static int func(int i) {
        if(i % 2 ==0) return i/2;
        return (i * 3) + 1;
    }
}
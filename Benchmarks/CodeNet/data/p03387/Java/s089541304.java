import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a+b+c;
        int max = 0;
        int[] arr = {a,b,c};
        for(int i=0; i<3; i++) {
            max = Math.max(max, arr[i]);
        }

        int cnt = 0;
        for(int i=0; i<max+1; i++) {
            if(max*3 == sum || (max+1)*3 == sum) {
                break;
            }
            sum += 2;
            cnt++;
        }
        System.out.println(cnt);
    }
}

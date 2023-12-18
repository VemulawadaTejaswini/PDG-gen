import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int countUp = A;
        int result = A;
        int needCnt = 1;
        
        if (result < B) {
            for (;result<B;) {
                result = result+countUp;
                needCnt++;
            }
            System.out.println(needCnt);
        } else {
            System.out.println(needCnt);
        }
        
    }
}
import java.util.Scanner;

class No2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = sc.nextInt();
        int a = 1;
        int cnt = 0;
        while (true){
            a = a * R;
            if(a > N){
                break;
            }
            cnt++;
        }

        System.out.println(cnt);
    }
}
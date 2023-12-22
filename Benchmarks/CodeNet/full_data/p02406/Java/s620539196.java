import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        int n = sc.nextInt();
        for(i=1;i<=n;i++){
            int x = i;
            while(true) {
                if (x % 3 == 0 || x % 10 == 3) {
                    System.out.printf(" %d", x);
                    break;
                }
                if(x == 0) break;
                x /= 10;
            }
        }
        System.out.printf("\n");
    }
}


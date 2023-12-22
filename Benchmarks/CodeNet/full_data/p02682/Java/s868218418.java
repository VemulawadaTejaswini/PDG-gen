import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();

        int ans = 0;
        int numa = 0;
        int numb = 0;
        for(int i=0; i<k; i++) {
            if(i < a) {
                ans += 1;
            } else {
                break;
            }
            numa++;
        }
        if(numa == k) printAns(ans);

        for(int j=0; j<k-numa; j++) {
            if(j < b) {
                ;
            } else {
                break;
            }
            numb++;
        }
        if(numa+numb == k) printAns(ans);

        for(int l=0; l<k-(numa+numb); l++) {
            if(l < c) {
                ans += -1;
            }
        }
        printAns(ans);
    }

    public static void printAns(int ans) {
        System.out.println(ans);
        System.exit(0);
    }
}

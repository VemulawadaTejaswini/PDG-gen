import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;;) {
            int a=sc.nextInt();
            if(a==0) {
                break;
            }
            int b=sc.nextInt();
            int count=0;
            int[] t= {60,60*60,60*60*60,60*60*60*60,60*60*60*60*60};
            for(int i=a;i<=b;i++) {
                for(int j=0;j<t.length;j++) {
                    if(t[j]%i==0) {
                        count++;
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
}

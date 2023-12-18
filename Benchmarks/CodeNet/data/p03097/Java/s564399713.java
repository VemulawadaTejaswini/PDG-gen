import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = (1<<n);
        int diff = 0;
        int pos = 0;
        for(int i=0; i<n; i++) {
            if((a>>i)%2 != (b>>i)%2) {
                diff++;
                pos = i;
            }
        }
        int maxbit = 1<<(n-1);
        int posbit = 1<<pos;
        StringBuilder sb = new StringBuilder();
        if(diff == 1) {
            sb.append("YES\n");
            for(int i=0; i<m; i++) {
                if(i>0) {
                    sb.append(" ");
                }
                int base = i ^ (i>>1);
                int max = (base & maxbit) != 0 ? 1 : 0;
                int p = (base & posbit) != 0 ? 1 : 0;
                if(max == 1 && p == 0) {
                    base -= maxbit;
                    base += posbit;
                }
                if(max == 0 && p == 1) {
                    base -= posbit;
                    base += maxbit;
                }
                sb.append(base ^ a);
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("NO");
        }

    }


}

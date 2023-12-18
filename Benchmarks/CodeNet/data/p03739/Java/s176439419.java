import java.util.Scanner;


public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int l[] = new int[scanner.nextInt()];
        for (int i = 0;i < l.length;++i){
            l[i] = scanner.nextInt();
        }
        for (int i = 0;i < l.length;++i){
            int p = 0;
            int q = 0;
            for (int j = 0;j <= i;++j){
                if(j != i) {
                    p += l[j];
                }
                q += l[j];
            }
           // System.out.println(q + ":" + p);
            if(q == 0||(q < 0&&p < 0)||(q > 0&&p > 0)){
                int c = 1 + ((p > 0) ? 1 : -1) * q;
                count += c;
                l[i] += ((p > 0) ? -1 : 1) * c;
               // System.out.println("adf" + i + ":" + c);
            }
        }
        System.out.println(count);

    }

}
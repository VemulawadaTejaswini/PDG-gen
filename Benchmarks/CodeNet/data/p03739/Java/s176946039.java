import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int l[] = new int[scanner.nextInt()];
        int x[] = new int[l.length];
        for (int i = 0;i < l.length;++i){
            l[i] = Integer.valueOf(scanner.next());
            if(i > 0){
                x[i] = l[i] + x[i - 1];
            }
            else{
                x[i] = l[i];
            }
        }
        for (int i = 1;i < l.length;++i){
            int p = x[i - 1];
            int q = x[i];
            if(q == 0||(q < 0&&p < 0)||(q > 0&&p > 0)){
                int c = 1 + ((p > 0) ? 1 : -1) * q;
                count += c;
                l[i] += ((p > 0) ? -1 : 1) * c;
            }
        }
        System.out.println(count);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int l[] = new int[scanner.nextInt()];
        int x[] = new int[l.length];
        int y[] = new int[l.length];
        for (int i = 0;i < l.length;++i){
            l[i] = Integer.valueOf(scanner.next());
            y[i] = Integer.valueOf(l[i]);
            if(i > 0){
                x[i] = l[i] + x[i - 1];
            }
            else{
                x[i] = l[i];
            }
        }
        boolean flag = true;
        while (true){
            for (int i = 1;i < l.length;++i){
                int p = x[i - 1];
                int q = x[i];
                if(q == 0||(q < 0&&p < 0)||(q > 0&&p > 0)){
                    flag = false;
                    int d = (p < 0&&q <= 0) ? 1 : -1;
                    l[i] += d;
                    for (int j = i;j < l.length;++j){
                        x[j] += d;
                    }
                }
            }
            if(flag){
                break;
            }
            flag = true;
        }
        for (int i = 1;i < l.length;++i){
            count += Math.abs(l[i] - y[i]);
        }
        System.out.println(count);
    }
}
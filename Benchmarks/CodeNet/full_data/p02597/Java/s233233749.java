import java.util.*;


public class Main {
    static boolean[] list;
    static int numr = 0;
    static int numw = 0;
    static int num = 0;
    static int lw = -1;
    static int rr = 0;
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        num = Integer.parseInt(line);
        line = sc.nextLine();
        list = new boolean[num]; //R=false,W=true

        for (int i = 0; i < num; i++){
            if (line.charAt(i) == 'R') {
                list[i] = false;
                rr = i;
                numr++;
            } else {
                list[i] = true;
                if (lw == -1) {
                    lw = i;
                }
                numw++;
            }
        }

        if (numr == 0 || numw == 0) {
            System.out.println("0");
            return ;
        }
        
        int count = 0;
        while (true) {
            list[rr] = true;
            list[lw] = false;
            count++;
            check();
            if (lw == numr) {
                break;
            }
        }
        
        System.out.println(count);
    }

    public static void check() {
        for (int i = lw; i <= num - numw + 1; i++) {
            if (list[i]) {
                lw = i;
                break;
            }
        }

        for (int i = rr; i >= numr - 1; i--) {
            if (!list[i]) {
                rr = i;
                break;
            }
        }
        return;
    }
}

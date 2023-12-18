import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        exec();
    }

    static void exec() {
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] h = new int[n];
        boolean[] sflg = new boolean[n];
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(sc.next());
            sflg[i] = false;
        }

        boolean nflag = false;
        for (int i = 0; i < n-1; i++) {
            int res = h[i]-h[i+1];
            if(res > 1) {
                nflag = true;
                break;
            } else if (res == 1) {
                h[i]--;
                sflg[i] = true;
                if(i>0) {
                    if(h[i-1] > h[i]) {
                        if(h[i-1] - h[i] > 1) {
                            nflag = true;
                            break;
                        }
                        for (int j = i-1; j >= 1 ; j--) {
                            if(sflg[j] == false) {
                                sflg[j] = true;
                                h[j]--;
                            }
                            if(h[j-1]<=h[j]) {
                                break;
                            } else if (h[j-1] > h[j] && sflg[j-1]==true) {
                                nflag = true;
                                break;
                            }

                        }
                    }
                }
            }
        }
        if(nflag) {
            out.print("No");
        } else {
            out.print("Yes");
        }

        out.flush();

    }

}

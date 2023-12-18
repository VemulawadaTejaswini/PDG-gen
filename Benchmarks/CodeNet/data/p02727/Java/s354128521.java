import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        long ans = 0;

        int[] red = new int[a];
        int[] green = new int[b];
        int[] nocolor = new int[c];

        for (int i=0; i<a; i++) red[i] = sc.nextInt();
        Arrays.sort(red);
        for (int i=0; i<b; i++) green[i] = sc.nextInt();
        Arrays.sort(green);
        for (int i=0; i<c; i++) nocolor[i] = sc.nextInt();
        Arrays.sort(nocolor);


        for (int i=a-1; a-x<=i; i--) ans += red[i];
        for (int i=b-1; b-y<=i; i--) ans += green[i];


        int tmpRed = 0;
        int tmpGreen = 0;

        for (int i=c-1; i>=0; i--) {
            if (red[tmpRed]>nocolor[i]) {
                if (green[tmpGreen]<nocolor[i]) {
                    ans += nocolor[i]-green[tmpGreen];
                    tmpGreen++;
                }
            } else {
                if (green[tmpGreen]>nocolor[i]) {
                    ans += nocolor[i]-red[tmpRed];
                    tmpRed++;
                } else {
                    if (green[tmpGreen]<red[tmpRed]) {
                        ans += nocolor[i]-green[tmpGreen];
                        tmpGreen++;
                    } else {
                        ans += nocolor[i]-red[tmpRed];
                        tmpRed++;
                    }
                }
            }
        }



        out.print(ans);
        out.flush();



    }

}

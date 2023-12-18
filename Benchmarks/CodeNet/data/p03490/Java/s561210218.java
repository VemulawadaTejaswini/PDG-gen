import java.util.*;

public class Main {
    static int[] vx = {1,0,-1,0};
    static int[] vy = {0,1,0,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int px = 0;

        boolean[][] dpx = new boolean[2][20000];
        boolean[][] dpy = new boolean[2][20000];
        int off = 10000;
        dpx[0][0 + off] = true;
        dpy[0][0 + off] = true;
        boolean f = true;
        boolean nx = true;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'F') {
                if(f) {
                    for(int j = 0; j < 20000; j++) {
                        dpy[(i+1) % 2][j] |= dpy[i % 2][j];
                        if(j == 19999) continue;
                        dpx[(i+1) % 2][j + 1] |= dpx[i % 2][j];
                    }
                } else {
                    if(nx) {
                        for(int j = 0; j < 20000; j++) {
                            dpy[(i+1)%2][j] |= dpy[i%2][j];
                            if(j != 0) {
                                dpx[(i+1) % 2][j - 1] |= dpx[i % 2][j];
                            }
                            if(j != 19999) {
                                dpx[(i+1) % 2][j + 1] |= dpx[i % 2][j];
                            }
                        }
                    } else {
                        for(int j = 0; j < 20000; j++) {
                            dpx[(i+1)%2][j] |= dpx[i%2][j];
                            if(j != 0) {
                                dpy[(i+1) % 2][j - 1] |= dpy[i % 2][j];
                            }
                            if(j != 19999) {
                                dpy[(i+1) % 2][j + 1] |= dpy[i % 2][j];
                            }
                        }
                    }
                }
                
            } else {
                if(f) {
                    f = false;
                } 
                nx = !nx;
                for(int j = 0; j < 20000; j++) {
                    dpy[(i+1)%2][j] = dpy[i%2][j];
                    dpx[(i+1)%2][j] = dpx[i%2][j];
                }
               
            }

            Arrays.fill(dpy[i%2],false);
            Arrays.fill(dpx[i%2],false);
        }


        boolean ans = dpx[s.length() % 2][x + off] && dpy[s.length() % 2][y + off];
        if(ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    static class Data {
        int x;
        int y;
        int v;
        Data(int a, int b, int c) {
            x = a;
            y = b;
            v = c;
        }
    }
}

import java.util.Scanner;

public class Main {
        public static int [] mvx = new int[8000];
        public static int [] mvy = new int[8000];
        
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            char [] sar = s.toCharArray();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            int nx = 0;
            int ny = 0;
            char dir = 'x';
            for (int i=0; i<sar.length; i++){
                if (sar[i] == 'F'){
                     if (dir == 'x') {
                        mvx[nx] = mvx[nx]+1;
                    } else {
                        mvy[ny] = mvy[ny]+1;
                    }
                } else if (sar[i] == 'T') {
                    if (dir == 'x') {
                        nx++;
                        mvx[nx] = 0;
                        dir = 'y';
                    } else {
                        ny++;
                        mvy[ny] = 0;
                        dir = 'x';
                    }
                }
            }
            if (sar[sar.length-1] == 'F') {
                    if (dir == 'x') {
                        nx++;
                    } else {
                        ny++;
                    }
            }
            Boolean rslt = false;
            if (PosX(0, nx, x) && PosY(0, ny, y)) System.out.println("Yes");
            else System.out.println("No");
        }
        
        public static boolean PosX (int f, int e, int goal){
            if (e == 1)
                if (mvx[e-1]==goal) return(true);
                else return(false);
            else{
                if (PosX(0, e-1, goal+ mvx[e-1])) return(true);
                else if (PosX(0, e-1, goal - mvx[e-1])) return(true);
            }
            return(false);
        }
        public static boolean PosY (int f, int e, int goal){
            
            if ((e == 1) && ((mvy[e-1]==goal) || (mvy[e-1]==-goal)) ) return(true);
            else{
                if (PosY(0, e-1, goal+ mvy[e-1])) return(true);
                else if (PosY(0, e-1, goal - mvy[e-1])) return(true);
            }
            return(false);
        } 
}
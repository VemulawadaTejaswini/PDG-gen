import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *  http://agc006.contest.atcoder.jp/tasks/agc006_f
 * 
 * @author Cummin
 */
public class Main {
    static int N ;
    static int M ;
    static int pos[][] ;
    static TreeMap<Integer, TreeMap> mat ;
    static int black_cnt ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        pos = new int[2][N] ;
        mat = new TreeMap<>() ;
        for (int i=0 ; i<M; i++) {
            pos[0][i] = sc.nextInt()-1 ;  // x, y
            pos[1][i] = sc.nextInt()-1 ;
            set_bit(pos[0][i], pos[1][i]) ;
        }
        black_cnt = M ;
        //
        int flag=1 ;
        while(flag==1) {
            flag = 0;
            for (int i = 0; i < M; i++) {
                int x, y;
                x = pos[0][i];
                y = pos[1][i];
                if (check_and_set(x,y)==1) flag=1 ;
            }
        }
        System.out.println(black_cnt);
        //System.out.printf("Ans= %d \n", black_cnt) ;
        //dump_mat() ;

    }
    static int check_and_set(int x, int y) {
        int flag = 0;
        for (int z = 0; z < N; z++) {
            if (get_bit(y, z) == 1) {
                if (get_bit(z, x) == 0) {
                    set_bit(z, x);
                    black_cnt++;
                    check_and_set(z,x) ;
                    flag = 1;
                }
            }
        }
        return flag;
    }
    static void set_bit(int x, int y) {
//        System.out.printf("set_bit(%d,%d)\n", x+1, y+1) ;
        TreeMap<Integer, Integer> n  ;
        if (mat.get(x)==null) {
            n = new TreeMap<>() ;
            n.put(y,1) ;
            mat.put(x, n) ;
        } else {
            n = mat.get(x) ;
            if (n==null) {
                n = new TreeMap<>() ;
            } 
            n.put(y,1) ;
            mat.put(x,n) ;
        }
    }
    static int get_bit(int x, int y) {
        TreeMap<Integer, Integer> n ;
        if (mat.get(x)==null) {
            return 0 ;
        } else {
            n = mat.get(x) ;
            if (n==null) {
                return 0 ;
            } 
            if (n.get(y)==null) return 0 ;
            else return n.get(y) ;
        }
    }
    static void dump_mat() {
        for (int iy=0 ;iy<N ;iy++) {
            for (int ix=0 ;ix<N; ix++) {
                if (get_bit(ix,iy)==0) System.out.printf(".") ;
                else System.out.printf("*") ;
            }
            System.out.println() ;
        }
    }
    static int power_2[] = {1,2,4,8,16,32,64,128,256,512,1024,2048,4096,1<<13, 1<<14, 1<<15, 1<<16, 1<<17, 
                 1<<18, 1<<19, 1<<20, 1<<21, 1<<22, 1<<23, 1<<24, 1<<25, 1<<26, 1<<27, 1<<28, 1<<29}; 

}

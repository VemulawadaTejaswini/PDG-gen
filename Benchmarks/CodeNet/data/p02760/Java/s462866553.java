import java.util.*;

class Main{
    public static void main(String[] args) {
        int[][] n = new int[3][3];
        int N = 0;
        boolean keisan = false;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 n[i][j] = Integer.parseInt(sc.next());  
            }
        }
        N = Integer.parseInt(sc.next());
        int b[] = new int[N];
        for (int k = 0; k < N; k++) {
            b[k] = Integer.parseInt(sc.next());
            keisan = Main.search(b[k],n);
            if (keisan == true) {
                break;
            } 
        }
        if (keisan==true) {
            System.out.println("Yes");
        } else if (keisan == false) {
            System.out.println("No");
        }
    }

    public static boolean search(int s,int n[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (s == n[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
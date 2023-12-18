import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] m = new char[3][3];
        for(int i = 0; i < 3; i++) {
            m[i] = sc.next().toCharArray();
        }

        for(int i = 0; i < 3; i++) {
            System.out.print(m[i][i]);
        }
        System.out.println();
        
    }
}
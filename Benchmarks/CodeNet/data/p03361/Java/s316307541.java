import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char campus[][] = new char[h][w];
        for (int i=0; i<h; i++){
            campus[i] = sc.next().toCharArray();
        }
        if (check(h, w, campus)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }

    private static boolean check(int h, int w, char[][] campus) {
        for (int i=0; i<h; i++){
            for (int j=0; j<w; j++){
                if (campus[i][j]=='#'){
                    if (i>0 && campus[i-1][j]=='#'){
                        continue;
                    }else if (j>0 && campus[i][j-1]=='#'){
                        continue;
                    }else if (i<h-1 && campus[i+1][j]=='#'){
                        continue;
                    }else if (j<w-1 && campus[i][j+1]=='#'){
                        continue;
                    }else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
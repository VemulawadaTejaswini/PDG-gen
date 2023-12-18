import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        char[][] c = new char[3][3];
        for(int i = 0; i < 3; i++){
            String s = scan.next();
            for(int j = 0; j < 3; j++){
                c[i][j] = s.charAt(j);
            }
        }
        System.out.println(c[0][0] +""+ c[1][1] +""+ c[2][2]);
        scan.close();
    }

    public static void main(String[] args){
        new Main().solve();
    }
}

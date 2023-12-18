import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        
        int x = tx - sx;
        int y = ty - sy;
        
        String answer = "";
        
        for (int i = 0; i < y; i++) {
            answer += "U";
        }
        for (int i = 0; i < x; i++) {
            answer += "R";
        }
        for (int i = 0; i < y; i++) {
            answer += "D";
        }
        for (int i = 0; i < x; i++) {
            answer += "L";
        }
        answer += "LU";
        for (int i = 0; i < y; i++) {
            answer += "U";
        }
        answer += "R";
        for (int i = 0; i < x; i++) {
            answer += "R";
        }
        answer += "DR";
        for (int i = 0; i < y; i++) {
            answer += "D";
        }
        answer += "DL";
        for (int i = 0; i < x; i++) {
            answer += "L";
        }
        answer += "U";
        
        // U*y+R*x+D*y+L*x +LU+ U*y +R+ R*x +DR+ D*y +L+ L*x + U
        System.out.println(answer);
    }
}

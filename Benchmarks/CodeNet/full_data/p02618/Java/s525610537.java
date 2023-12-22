import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        var sc = new Scanner(System.in);
    
        int D = Integer.parseInt(sc.next());
        var c = new int[26];
        for(int i = 0; i < 26; i++){
            c[i] = Integer.parseInt(sc.next());
        }
        var s = new int[D][26];
        for(int i = 0; i < D; i++){
            for(int j = 0; j < 26; j++){
                s[i][j] = Integer.parseInt(sc.next());
            }
        }
        
        var sb = new StringBuilder();
        for(int i = 0; i < D; i++){
            sb.append(1 + i%26).append(System.lineSeparator());
        }
        System.out.print(sb);
    }
}
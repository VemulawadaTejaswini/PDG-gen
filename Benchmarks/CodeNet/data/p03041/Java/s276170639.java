import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] input = line.split(" ", 0);
        int N = Integer.valueOf(input[0]).intValue();
        int S = Integer.valueOf(input[1]).intValue();
        line = sc.nextLine();

        char[] c = line.toCharArray();

        if(c[S-1] == 'A'){
            c[S-1] = 'a';
        }else if(c[S-1] == 'B'){
            c[S-1] = 'b';
        }else if(c[S-1] == 'C'){
            c[S-1] = 'c';
        }

        for(int i = 0; i < N; i++) {
            System.out.print(c[i]);
        }
    }
}
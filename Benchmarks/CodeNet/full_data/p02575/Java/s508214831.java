import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Harry on 5/10/20.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int c = 1;
        int steps = 0;
        boolean isReachable = true;
        for(int r=1; r<=h; r++){
            int st = scanner.nextInt();
            int ed = scanner.nextInt();
            if(c>=st && c<=ed){
                steps += ed+1-c;
                c = ed+1;
            }
            if(c>w){
                isReachable = false;
            }
            steps++;
            System.out.println(isReachable ? steps : -1);
        }
    }
}

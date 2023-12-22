import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height, width;
        int cnt;
       
        while( true ) {
            height = scanner.nextInt();
            width = scanner.nextInt();
            cnt = 2;
            if(height == 0 && width == 0) {
                break;
            }
            
            for(int i = 0; i < height; i++) {
                for(int j = 0; j < width; j++) {
                    if(cnt%2 == 0) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                    cnt++;
                }
                System.out.println();
                cnt++;
            }
            System.out.println();
        }
        
    }
}
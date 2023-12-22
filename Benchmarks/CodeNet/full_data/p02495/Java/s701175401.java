import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height, width;
       
        while( true ) {
            height = scanner.nextInt();
            width = scanner.nextInt();
            if(height == 0 && width == 0) {
                break;
            }
            
            for(int i = 0; i < height; i++) {
                for(int j = 0; j < width; j++) {
                    if( (i+j)%2 == 0 ) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }  
    }
}
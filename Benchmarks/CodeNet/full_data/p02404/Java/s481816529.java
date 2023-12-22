import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        while (true) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            
            if (h==0 && w==0) {
                break;
            }
            
            for (int i=0; i<h; i++) {
                for (int j=0; j<w; j++) {
                    if ( 0 < i && i < (h-1) && 0 < j && j < (w-1) ) {
                        sb.append(".");
                    } else {
                        sb.append("#");
                    }
                }
                sb.append("\n");
            }
            sb.append("\n");
            
        }
        System.out.print(sb);
        
    }
    
}

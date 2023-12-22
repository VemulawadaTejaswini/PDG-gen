import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x=1,y=1;
        while(x != 0 || y != 0){
            y = sc.nextInt();
            x = sc.nextInt();
            if (x == 0 && y == 0) break;
            for(int i=0;i<y;i++){
                for(int j=0;j<x;j++){
                    System.out.print('#');
                }
                System.out.println();
            }
            System.out.println();
        }
        
        sc.close();
    }
}


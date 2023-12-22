import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int z = 0;
        
        while(true){
            x = sc.nextInt();
            y = sc.nextInt();
            if(x == 0 && y == 0)break;
            if(x > y){
                z = x;
                x = y;
                y = z;
            }
            System.out.println(x + " " + y);
        }
        
    }
}


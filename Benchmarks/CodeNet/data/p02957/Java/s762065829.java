import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a == b) {
            System.out.print("POSSIBLE");
        }
        else{
            int max = Math.max(a,b);
            int min = Math.min(a,b);
            if((max-min) % 2 == 0){
                System.out.print("POSSIBLE");
            }
            else{
                System.out.print("IMPOSSIBLE");
            }
            
        }
        scan.close();
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //入力準備
        Scanner sc = new Scanner(System.in);
        int x,y;
        
        //入力値の受け取り
        while(true){
            x = sc.nextInt();
            y = sc.nextInt();
            if(x == 0 && y == 0) break;
            
            if(x < y){
                System.out.println(x + " " + y);
            }else{
                System.out.println(y + " " + x);
            }
        }
    }
}

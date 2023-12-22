import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        
        inOrOut(W, H, x, y, r);
        
    }
    public static void inOrOut(int W, int H, int x, int y ,int r){
        Boolean circleCheck = true;
        if(x < r || x + r > W){
            circleCheck = false;
        }else if(y < r || y + r > H){
            circleCheck = false;
        }
        
        if(circleCheck == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}


import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int W = Integer.parseInt(sc.next());
        
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        if(W > a){
            int W_a = W + a;
            if(b - W_a > 0){
                System.out.println(b - W_a);
            }else{
                System.out.println(0);
            }
        }else{
            int W_a = a - W;
            System.out.println(W_a - b);
        }
    }
}
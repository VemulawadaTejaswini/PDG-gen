import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int W = Integer.parseInt(sc.next());
        
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        if(a > b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        
        System.out.println(Math.max(b - (a + W), 0));
    }
}
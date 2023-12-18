import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());

        for(int i = 0; i < 10; i++) {
            x = r * x - D;
            System.out.println(x);
        }
    }
}
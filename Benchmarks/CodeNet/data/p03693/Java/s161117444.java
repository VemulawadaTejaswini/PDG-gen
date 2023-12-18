import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int r = Integer.parseInt(sc.next());
        int g = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        String input = Integer.toString(r) + Integer.toString(g) + Integer.toString(b);
        int value = Integer.parseInt(input);
        
        if(value % 4 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }
}
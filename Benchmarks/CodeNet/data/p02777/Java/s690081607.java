import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String u = sc.next();
        if(s.equals(u)){
            a += -1;
            String as = String.valueOf(a);
            String bs = String.valueOf(b);
            System.out.println(as+" "+bs);
        } else {
            b += -1;
            String as = String.valueOf(a);
            String bs = String.valueOf(b);
            System.out.println(as+" "+bs);
        }
    }
}
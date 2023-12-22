import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long X = Long.parseLong(sc.next());
        int a = 0;
        int b = 0;
        if(X == 1) {
            b = -1;
        }else {
            for(int i = -(int)Math.pow(X, 1.0/5.0); i < Math.sqrt(X); i++) {
                if((float)Math.pow(X + Math.pow(i, 5), 1.0/5.0) % 1 == 0) {
                    a = (int)(Math.pow((X + Math.pow(i, 5)), 1.0/5.0));
                    b = i;
                    break;
                }
            }
        }
        
        System.out.println(a+" "+b);
    }
}
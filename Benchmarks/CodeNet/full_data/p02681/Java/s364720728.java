import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int slength = s.length();
        int tlength = t.length();

        String t2 = t.substring(0, slength);
        
        if( tlength - slength ==1 ){
            if(s.equals(t2)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("No");
        }

    }
}

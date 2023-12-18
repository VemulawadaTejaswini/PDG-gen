import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int point = str.length()-1;
        while(point > 0) {
            String s = str.substring(0,point);
            point--;
            if(s.length()%2!=0) continue;
            if(s.substring(0,s.length()/2).equals(s.substring(s.length()/2))) {
                System.out.println(s.length());
                return;
            }
        }
        System.out.println(0);
    }
}
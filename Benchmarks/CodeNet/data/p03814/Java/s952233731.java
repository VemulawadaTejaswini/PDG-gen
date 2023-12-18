import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = -s.indexOf("A")+s.lastIndexOf("Z")+1;
        System.out.println(ans);
    }
}
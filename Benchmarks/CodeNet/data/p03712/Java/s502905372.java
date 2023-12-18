import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=W+2;i++) sb.append("#");
        System.out.println(sb.toString());
        for(int i=1;i<=H;i++){
            String cur = sc.next();
            StringBuilder now = new StringBuilder();
            now.append("#");
            now.append(cur);
            now.append("#");
            System.out.println(now.toString());
        }
        System.out.println(sb.toString());
    }
}
 
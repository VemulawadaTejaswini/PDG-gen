import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int dayRcoin = scan.nextInt();
        int weekRcoin = scan.nextInt();
        int aimRcoin = scan.nextInt();
        int nowRcoin = 0;
        int logindays;

        for(logindays=0; nowRcoin<aimRcoin; logindays++)
            nowRcoin+=logindays%7==6 ? dayRcoin+weekRcoin : dayRcoin;
        
        System.out.println(logindays);
    }
}

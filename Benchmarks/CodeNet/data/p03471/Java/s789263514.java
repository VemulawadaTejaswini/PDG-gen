import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cardNum = Integer.parseInt(sc.next());
        int money = Integer.parseInt(sc.next());

        int x = 0;
        int y = 0;
        int z = 0;
        if (cardNum*10000 < money) {
            System.out.println("-1 -1 -1" );
            return;
        }
        if (cardNum*1000 > money) {
            System.out.println("-1 -1 -1" );
            return;
        }
        
        z = cardNum;
        boolean flag = true;
        int res= 0;
        while (flag) {
            res =z*1000+y*5000+x*10000;
            if (res==money) {
                System.out.println(x+ " "+ y + " " +z);
                flag = false;
                continue;
            }
            if (z==0) {
                System.out.println("-1 -1 -1" );
                flag = false;
                continue;
            }
            if (money-res>=9000) {
                z--;
                x++;
                continue;
            }
            if(money-res>=4000) {
                z--;
                y++;
                continue;
            }
        }
    }
}

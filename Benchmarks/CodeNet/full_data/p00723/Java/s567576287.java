import java.util.*;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int loop = 0; loop < n; loop++) {
            String train = scan.next();
            HashSet<String> set = new HashSet<String>();
            int len = train.length();
            for (int i = 1; i < len; i++) {
                String front = train.substring(0,i);
                String rear = train.substring(i);
                String r_front = 
                    new StringBuffer(front).reverse().toString();
                String r_rear = 
                    new StringBuffer(rear).reverse().toString();
                set.add(front.concat(rear));
                set.add(front.concat(r_rear));
                set.add(r_front.concat(rear));
                set.add(r_front.concat(r_rear));
                set.add(rear.concat(front));
                set.add(rear.concat(r_front));
                set.add(r_rear.concat(front));
                set.add(r_rear.concat(r_front));
            }
            System.out.println(set.size());
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        String a = scan.next();

        for (int i = 0; i <a.length(); i++) {
            //System.out.println("i is :"+i);

            for (int n =a.length(); n >i; n--) {
               // System.out.println("N is :"+n);
                String kazu=a.substring(i,n);
                //System.out.println(kazu);
                long suuzi =0;
                suuzi=Long.parseLong(kazu);
                if(suuzi%2019==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}


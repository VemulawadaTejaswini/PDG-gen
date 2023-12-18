

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();

        int count1 = 0;
        String tmp = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '1') {
                tmp = String.valueOf(s.charAt(i));
                break;
            }
            count1++;
        }
        if(k > count1) {
            System.out.println(tmp);
        } else {
            System.out.println("1");
        }
    }
}

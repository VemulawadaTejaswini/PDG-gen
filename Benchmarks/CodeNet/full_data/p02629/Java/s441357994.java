import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = " abcdefghijklmnopqrstuvwxyz";
        int n,amari,i;
        String name = "";
        String ans="";

        n = sc.nextInt();
        
        if (n % 26 == 0) {
            while (n != 1) {
                n /= 26;
                name += 'z';
            }
        }
        else {
            while (n > 26) {
                amari = n % 26;
                n /= 26;
                name += str.charAt(amari);
            }
            name += str.charAt(n);
        }
        int len = name.length();

        for (i = 0; i < len; i++) {
            ans += name.charAt(len - 1 - i);
        }
        System.out.println(ans);
    }

}
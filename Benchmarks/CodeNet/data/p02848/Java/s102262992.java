import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char[] a = scn.next().toCharArray();
        for(char tmp : a) {
            int num = 0;
            if((char)(tmp + n) > 'Z'){
                num = n - 26;
                System.out.print((char)(tmp + num));
            }else {
                System.out.print((char) (tmp + n));
            }
        }
    }
}
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int length = S.length();
        String len = S.replaceAll("D","");
        System.out.println(Math.abs(length - 2*len.length()));
    }
}
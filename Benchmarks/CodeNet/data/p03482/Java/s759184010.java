import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n  = s.length();
        int left = n/2;
        int right = n/2+(n%2 ^ 1);
        int width = n%2;
        boolean aligned = true;
        char mod = s.charAt(left);
        while(aligned & left >= 0 & right < n){
            left--;
            right++;
            if (s.charAt(right)!=mod | s.charAt(left)!=mod) {
                aligned = false;
            } else {
                width+=2;
            }
        }
        int k = n/2 + width/2 + width%2;
        System.out.println(k);
    }
}
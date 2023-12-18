
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int left = 0;
        int max = 0;
        int right=0;
        while(true){
            while(right < s.length && (s[right]=='A' || s[right]=='T' || s[right] == 'C' || s[right] == 'G'))right++;
            max = Math.max(max,right-left);
            if(right >= s.length)break;
            left = right+1;
            right++;
        }
        sc.close();
        System.out.println(max);
    }
}
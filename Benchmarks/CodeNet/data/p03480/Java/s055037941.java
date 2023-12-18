import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        char[] s = scan.nextLine().toCharArray();
        char lc = s[0];
        int cnt = 0;
        int max = 2;
        for(char c : s){
            if(c == lc){
                cnt++;
            }else{
                if(cnt > max) max = cnt;
                cnt = 1;
            }
            lc = c;
        }
        if(cnt > max) max = cnt;
        System.out.println(max);
        scan.close();
        
    }
}
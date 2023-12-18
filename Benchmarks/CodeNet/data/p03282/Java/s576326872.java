import java.util.*;
import java.lang.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        int K = scan.nextInt();
        char tmp = '1';
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) != '1'){
                tmp = S.charAt(i);
                break;
            }
        }
        System.out.println(tmp);
    }
}

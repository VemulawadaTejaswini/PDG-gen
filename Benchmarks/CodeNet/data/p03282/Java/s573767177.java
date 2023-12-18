import java.util.*;
import java.lang.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        int K = scan.nextInt();
        char tmp = '1';
        int index = S.length();
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) != '1'){
                tmp = S.charAt(i);
                index = i+1;
                break;
            }
        }
        if(index > K)
            System.out.println(1);
        else
            System.out.println(tmp);
    }
}

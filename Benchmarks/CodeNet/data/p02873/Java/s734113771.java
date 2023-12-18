import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int keep = 0;
        int left = 0;
        int now = 0;
        int next = 0;
        long result = 0;
        for(int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            if(c == '<'){
                next = now + 1;
                result += next;
                keep = 0;
                left = next;
            }else{
                next = 0;
                if(now == 0){
                    if(left > keep - 1){
                        result += keep - 1;
                    }else{
                        result += keep;
                        left += 1;
                    }
                }
            }
            keep++;
            now = next;
        }
        System.out.println(result);
    }
}

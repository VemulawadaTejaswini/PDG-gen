
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        String prev="";
        int count = 0;
        int i=0;
        while(i<s.length){
            String tmp = s[i];
            if(prev.equals(tmp)){
                if(i==s.length-1){
                    break;
                }
                i++;
                tmp += s[i];
            }
            count++;
            prev = tmp;
            i++;
        }
        System.out.println(count);
    }
}
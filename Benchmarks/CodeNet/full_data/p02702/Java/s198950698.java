import java.util.*;

class Main{
    static int mod = 1000000000+7;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Integer max_len = s.length();

        Integer len = 5;
        Long count = 0L;
        while(len <= max_len){
            for(int i=0;i+len<=max_len;i++){
                String subs = s.substring(i, i+len);
                Long tmp = Long.valueOf(subs);
                if(tmp%2019L==0)count++;
            }
            len++;
        }
        System.out.println(count);
    }
}

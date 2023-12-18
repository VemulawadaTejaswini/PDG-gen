import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        StringBuilder sb = new StringBuilder();
        int flag = 1;
        int pos = 0;
        while(N!=0){
            long cur = 2*(1<<pos);
            if(N%cur!=0){
                sb.append(1);
                N -= flag*(cur/2);
            }
            else{
                sb.append(0);
            }
            pos++;
            flag *= -1;
        }
        System.out.println(sb.reverse().toString());
    }
}
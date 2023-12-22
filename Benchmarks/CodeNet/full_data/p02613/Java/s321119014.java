import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] words = new String[N];
        for(int i=0; i<N; i++){
            words[i] = scan.next();
        }
        scan.close();

        int ac_cnt=0;
        int wa_cnt=0;
        int tle_cnt=0;
        int re_cnt=0;

        for(int i=0; i<N; i++){
            switch(words[i]){
                case "AC":
                    ac_cnt++;
                    break;
                case "WA":
                    wa_cnt++;
                    break;
                case "TLE":
                    tle_cnt++;
                    break;
                case "RE":
                    re_cnt++;
                    break;
            }
        }
        System.out.println("AC x " + ac_cnt);
        System.out.println("WA x " + wa_cnt);
        System.out.println("TLE x " + tle_cnt);
        System.out.println("RE x " + re_cnt);
    }
}
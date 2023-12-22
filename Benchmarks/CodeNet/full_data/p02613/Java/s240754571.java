import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] res = new String[N];
        int ac = 0, wa = 0, tle = 0, re = 0;
        for(int i=0; i<N; i++){
            res[i] = sc.next();
            if(res[i].equals("AC")){
                ac++;
            }else if (res[i].equals("WA")){
                wa++;
            }else if(res[i].equals("TLE")){
                tle++;
            }else{
                re++;
            }
        }
        System.out.println("AC x "+ac+"\nWA x "+wa+"\nTLE x "+tle+"\nRE x "+re);
    }
}
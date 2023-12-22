import static java.lang.System.*;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        String s = sc.next();
        if((s.equals("SSR")) || (s.equals("SRS")) || (s.equals("RSS")) || (s.equals("RSR"))){
            ans = 1;
        }else if((s.equals("RRS")) || (s.equals("SRR"))){
            ans = 2;
        }else if(s.equals("RRR")){
            ans = 3;
        }else if(s.equals("SSS")){
            ans = 0;
        }
        out.println(ans);
        
    }
}
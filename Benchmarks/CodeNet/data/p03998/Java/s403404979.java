import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String SA = sc.next();
        String SB = sc.next();
        String SC = sc.next();
        
        int counta= 0;
        int countb= 0;
        int countc= 0;
        int idx = 0;
        
        while(counta<SA.length() && countb<SB.length() && countc<SC.length()){
            if(idx == 0){
                if(SA.charAt(counta) == 'a'){
                    counta++;
                }else if(SA.charAt(counta) == 'b'){
                    countb++;
                    idx = 1;
                }else if(SA.charAt(counta) == 'c'){
                    countc++;
                    idx = 2;
                }
            }else if(idx == 1){
                if(SB.charAt(countb) == 'a'){
                    counta++;
                    idx = 0;
                }else if(SB.charAt(countb) == 'b'){
                    countb++;
                }else if(SB.charAt(countb) == 'c'){
                    countc++;
                    idx = 2;
                }
            }else{
                if(SC.charAt(countc) == 'a'){
                    counta++;
                    idx = 0;
                }else if(SC.charAt(countc) == 'b'){
                    countb++;
                    idx = 1;
                }else if(SC.charAt(countc) == 'c'){
                    countc++;
                }
            }
        }
        
        if(counta == SA.length()) System.out.println("A");
        if(countb == SB.length()) System.out.println("B");
        if(countc == SC.length()) System.out.println("C");
        
    }
}
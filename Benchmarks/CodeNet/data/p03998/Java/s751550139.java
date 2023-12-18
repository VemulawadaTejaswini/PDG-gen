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
        boolean judge =true;
        
        while(judge){
            if(idx == 0){
                if(SA.charAt(counta) == 'b'){
                    idx = 1;
                }else if(SA.charAt(counta) == 'c'){
                    idx = 2;
                }
                counta++;
                if(counta == SA.length() && idx == 0){
                    judge = false;
                    break;
                }
        }else if(idx == 1){
                if(SB.charAt(countb) == 'a'){
                    idx = 0;
                }
                else if(SB.charAt(countb) == 'c'){
                    idx = 2;
                }
                countb++;
                if(countb == SB.length() && idx == 1){
                    judge = false;
                    break;
                }
            }else{
                if(SC.charAt(countc) == 'a'){
                    idx = 0;
                }else if(SC.charAt(countc) == 'b'){
                    idx = 1;
                }
                countc++;
                if(countc == SC.length() && idx == 2){
                    judge = false;
                    break;
                }
            }
        }
        
        if(counta == SA.length() && idx == 0) System.out.println("A");
        if(countb == SB.length() && idx == 1) System.out.println("B");
        if(countc == SC.length() && idx == 2) System.out.println("C");
        
    }
}
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int ascore,bscore;
        int a=0,b=0;
        int i=0;
        
        
        while(sc.hasNext()){
            num = sc.nextInt();
            if(num == 0){
                break;
            }
            ascore=0;
            bscore=0;
            for(i = 1; i < num+1; i++){
                a = sc.nextInt();
                b = sc.nextInt();
                if(a > b)  {
                    ascore = ascore + a + b;
                }else if(a < b){
                    bscore = bscore + a + b;
                }else{
                    ascore += a;
                    bscore += b;
                }
            }
            System.out.println(ascore + " " + bscore);
        }
    }
}
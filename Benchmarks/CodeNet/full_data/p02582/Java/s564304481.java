
import java.util.*;
import java.lang.*;


public class main {
    public static void main(String[] args) {
        Scanner saj = new Scanner(System.in);
        String work = saj.next();
        int ann=0;
        int maxlen=0;
        boolean stat=false;
        for(int i=0;i<work.length();i++){
            if(stat=true){
                if(work.charAt(i)=='R'){
                    ann++;
                    if(maxlen<=ann){
                        maxlen=ann;
                    }
                }
                else{
                    if(maxlen<=ann){
                        maxlen=ann;

                    }
                    ann=0;
                    stat=false;
                }
            }
            else{
                if(work.charAt(i)=='R'){
                    stat=true;
                    ann++;
                }
                else{
                    stat=false;
                }

            }
        }
        System.out.println(maxlen);

    }

}




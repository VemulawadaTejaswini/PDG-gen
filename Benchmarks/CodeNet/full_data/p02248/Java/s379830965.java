import java.util.Scanner;
  
/**
 * 
 */
  
/**
 * @author kawakami
 *
 */
class Main {
  
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner as = new Scanner(System.in);
          
        String T ="";
        String P ="";
        String TT = "";
          
        int point = 0;
        int hyouj = 0;
          
        T = as.next();
        P = as.next();
          
        TT = T;
          
        while(point != -1){
              
            point = T.indexOf(P);
            if(point != -1){
              
                T = T.substring(point+1);
                hyouj = (TT.length()-T.length())-1;
                System.out.println(String.valueOf(hyouj));
                  
            }
        }
  
    }
  
}
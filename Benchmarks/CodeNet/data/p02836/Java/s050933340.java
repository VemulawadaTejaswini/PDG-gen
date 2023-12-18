import java.util.*;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[]ss = S.toCharArray();
 
        int cou = 0;
        for(int i=0; i<S.length()/2; i++){
            if(ss[i]!=ss[S.length()-1-i]){
                cou++;
            }       
}
            System.out.println(cou);
        }
}

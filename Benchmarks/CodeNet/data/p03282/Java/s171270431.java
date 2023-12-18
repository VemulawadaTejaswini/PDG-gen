import java.util.*;
 
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 

        String S = sc.next();
        long K = sc.nextLong();
        sc.close();
        int pos = 0;
        while(pos < S.length()){
            if(S.charAt(pos) != '1'){
                System.out.println(S.charAt(pos));
                break;
            } else
                pos++;
            if(pos == S.length()){
                System.out.println(1);
            }
        }
    }
}
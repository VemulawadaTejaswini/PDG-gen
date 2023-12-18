import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        String S = scan.next();

        boolean flag = false;
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(i%2 == 0){
                if(c=='L'){
                    flag = true;
                }
            }else{
                if(c=='R'){
                    flag = true;
                }
            }
        }

        if(flag){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        
    }
}

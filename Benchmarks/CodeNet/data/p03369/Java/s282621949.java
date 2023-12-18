import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        

        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        String list[] = S.split("");
        
        int price=700;
        
        for(int i=0;i<S.length();i++){
            if(list[i].equals("o")){
                price+=100;
                
                
            }
        }
        System.out.println(price);
    }
    
} 
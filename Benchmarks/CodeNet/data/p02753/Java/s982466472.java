import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        String S =sc.next();
        String word[] =S.split("");
        
        String result ="";
        
        
        for(int i=0;i<word.length;i++){
            if(word[i].equals("A")){
                result ="No";
            }else if(word[i].equals("B")){
                result ="No";
            }else{
                result ="Yes";
            }
            
        }
        
        System.out.println(result);
        
    }
    
    
}

import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        boolean ok=true;
        for(int i=0;i<S.length();i++){
            for(int j=i+1;j<S.length();j++){
                if(S.charAt(i)==S.charAt(j)){
                    ok=false;
                }
        }}
        if(ok){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

}
        
        
    }

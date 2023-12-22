import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String str = s.next();
        int count = -1;
        
        String forStr;
        for(int i=str.length(); 0<=i; i--){
            forStr = String.format(".*R{%d}.*", i);
            if(str.matches(forStr)){
                count = i;
                i=-1;
            }
        }
        System.out.println(count);
    }
}
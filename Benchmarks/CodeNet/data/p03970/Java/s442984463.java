import java.util.*;

public class Main {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int result = 0;
        String a = "CODEFESTIVAL2016";
        for (int i = 0; i < 16;i++ ){
            if(str.substring(i-1,i).equals(a.substring(i-1, i))){
                result ++;
            }
        }
        System.out.println(16-result);
    }
    
}
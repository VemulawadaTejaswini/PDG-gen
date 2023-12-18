import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main{
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        int num = s.length();
        char [] list = new char [num];
        
        for (int index=0; index<num; index++){
            list[index]=s.charAt(index);
        }
        
        for (int index=0; index<num; index++){
            if (s.charAt(index)=='?'){
               list[index]='.';
            } 
        }
        
        StringBuilder sb = new StringBuilder ();
        
        for (int index=0; index<num; index++){
            
            sb.append(list[index]);
            
        }
     
        Pattern p = Pattern.compile(sb.toString());
        int count = 0;
        
        for (int index=0; ; index++){
            int multiple = index*13+5;
            StringBuilder sb2 = new StringBuilder (String.valueOf(multiple));
            for (; sb2.length()<sb.length();){
                sb2.append('0');
            }
            if (sb2.length()>(sb.length())){
                break;
            }
            Matcher m = p.matcher(sb2);
            
            if (m.find()){
                count++;
            }
        }
        
        System.out.println(count);
        
        
        
    }
}

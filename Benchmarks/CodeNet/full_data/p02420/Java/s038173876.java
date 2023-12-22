import java.awt.print.Printable;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;
  
public class Main{      
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = new String();
        while(true){
             = sc.next();
            if(str=="-")
                break;
            int num = sc.nextInt();
            for(int i=0;i<num;i++)
            {
                int count=sc.nextInt();
                String str1=str.substring(0,count);
                String str2=str.substring(count,str.length());
                str = str1 + str2;
            }
        }  
        System.out.println(str);    
    }   
}

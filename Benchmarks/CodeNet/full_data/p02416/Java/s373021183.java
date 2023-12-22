import java.util.Scanner;
import javax.sound.midi.SysexMessage;
  
public class Main{      
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int ans=0;
        for(;i<1000;i++){
            int m = sc.nextInt();
            if(m==0)
                break;
            int len = String.valueOf(m).length();
            for (int j=0; j<len; j++)
            {
                ans += String.valueOf(m).charAt(j);
            }
        }
        System.out.println(ans);  
    }
}              

    

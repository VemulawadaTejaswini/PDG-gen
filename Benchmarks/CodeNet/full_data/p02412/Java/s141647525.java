import java.util.Scanner;
import javax.sound.midi.SysexMessage;
  
public class Main{      
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2[] = str.split(" ");
        int n = Integer.parseInt(str2[0]);
        int x = Integer.parseInt(str2[1]);
        while(n==0&&x==0){
            int count = 0;
            for(int i=0;i<x-2;i++)
            {
                for(int j=i+1;j<x-1;j++)
                {
                    for(int k=j+1;k<x;k++)
                    {
                        if(i+j+k==x)
                            count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    
}              

    

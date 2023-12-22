import java.awt.datatransfer.FlavorEvent;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;
  
public class Main{      
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.nextLine();
        String str2[] = str.split(" ");
        int ints[] = new int[n];
        int flag = 1;
        int count = 0;

        while (flag==0){
             flag = 0;
             for(int j=n-1;j>1;j--)
            {
                if(ints[j]<ints[j-1])
                {
                    int x = ints[j];
                    ints[j]=ints[j-1];
                    ints[j-1]=x;
                    flag = 1;
                    count++;
                }
            }
        }
        for (int i = 0; i<n;i++)
        {
          System.out.println(ints[i]+" ");
        }
        System.out.println("\n"+count);
    }   
}              

    

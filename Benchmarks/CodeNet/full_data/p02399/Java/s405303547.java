import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner InData = new Scanner(System.in);
        int a = InData.nextInt();
        int b = InData.nextInt();
       
        int Shang;
        int Yu;
        float F;

        Shang = a/b;
        Yu = a%b;
        F = (float)a/(float)b;
        
        System.out.print(Shang+" "+Yu+" ");
        System.out.printf("%.5f\n",F);
    }
}
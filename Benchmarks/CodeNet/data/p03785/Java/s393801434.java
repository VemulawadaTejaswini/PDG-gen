import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),c=sc.nextInt(),k=sc.nextInt();
        int[] t=new int[n];
        for (int i = 0; i < n; i++) {
            t[i]=sc.nextInt();
        }
        Arrays.sort(t);
        int bus=0,pas=1,time=t[0];
        for (int i = 1; i < n; i++) {
            if(time+k<=t[i]&&pas<c){
                pas++;
            }else{
                bus++;
                pas=0;
                time=t[i];
            }
        }
        out.println(bus);
    }
}
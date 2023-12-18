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
        int bus=0;
        int r=0;
        for (int l = 0; l < n; l++) {
            while(t[l]<=t[r]&&t[r]<=t[l]+k&&r-l+1<c){
                r++;
            }
            bus++;
            l=r++;
        }
        out.println(bus);
    }
}
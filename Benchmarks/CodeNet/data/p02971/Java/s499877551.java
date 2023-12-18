import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());
        int[] l=new int[n];
        for(int i=0;i<n;i++){
            l[i] = Integer.parseInt(s.nextLine());
        }
        for(int i=0;i<l.length;i++){
            int[] t = l.clone();
            t[i] = 0;
            int max = 0;
            for(int j=0;j<t.length;j++){
                if(t[j] > max){
                    max = t[j];
                }
            }
            System.out.println(max);
        }
    }
}
import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int n = s.length();
        int[] st = new int[n+1];
        for(int i=0; i<n; i++){
            st[i] = s.charAt(i) - 'A';
        }
        
        long ans = 0;
        int[] usb = new int[n+3];
        
        for(int i=0; i<n; i++){
            if(st[i] == 0){
                //前のんと+1
                usb[i+1] += usb[i]+1;
            }else if(st[i]==1 && st[i+1]==2){
                int tmp = usb[i];
                ans += tmp;
                usb[i+2] += tmp;
            }
        }
        
        for(int i=0; i<n; i++){
            System.out.println(st[i]);
        }
        
        
        System.out.println(ans);
    }
}
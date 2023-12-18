import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int n = s.length();
        int[] st = new int[n+1];
        for(int i=0; i<n; i++){
            st[i] = s.charAt(i) - 'A';
        }
        
        int ans = 0;
        int[] usb = new int[n+3];
        
        for(int i=0; i<n; i++){
            if(st[i] == 0){
                //前のんと+1
                usb[i+1] += usb[i]+1;
            }
            if(st[i]==1 && st[i+1]==2){
                int tmp = usb[i];
                ans += tmp;
                i++;
                usb[i+1] += tmp;
            }
        }
        
        System.out.println(ans);
    }
}
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int cnt = 0;
        int sabun = 0;
        int max  =0;

        for(int i = 0;i<5;i++){
            a[i] = sc.nextInt();
            cnt+=a[i];
            sabun = (int)(Math.ceil((double)a[i]/10))*10-a[i];
            //System.out.println(sabun);
            cnt+=sabun;
            if(max<sabun){
                max=sabun;
            }

        }

        cnt -=max;

        System.out.println(cnt);
    }
}

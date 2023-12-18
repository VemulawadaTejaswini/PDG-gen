import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int i = 0;
        int j = 0;
        int uu,u,t,l,ll;
        int max=0,temp;
        for(i=0;i<n;i++) a[i] = sc.nextInt();

        for(i=0;i<n;i++){
            uu = 0; u = 0; t = 0; l=0; ll=0;
            for(j=0;j<n;j++){
                temp = a[j]-a[i];
                if(temp == 2) uu++;
                else if(temp == 1) u++;
                else if(temp == 0) t++;
                else if(temp == -1) l--;
                else if(temp == -2) ll--;
            }
            if(uu+u+t > max) max = uu+u+t;
            if(u+t+l > max) max = u+t+l;
            if(t+l+ll > max) max = t+l+ll;
        }

        System.out.println(max);
    }
}

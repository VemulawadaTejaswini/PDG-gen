import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        boolean[] b = new boolean[n];
        Arrays.fill(b,true);
        int ans = 0;
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++) {
            System.out.println(a[i]);
        }

        for(int i=0;i<n;i++){
            if(!b[i]){
               break;
            }
            for(int j=i+1;j<n;j++){
                if(a[j]%a[i]==0){
                    b[j]=false;
                    if(a[j]==a[i]){
                        b[i]=false;
                    }
                }
            }

        }
        for (boolean f: b) {
            if (f) ans++;
        }


        System.out.println(ans);
     scn.close();

    }

}
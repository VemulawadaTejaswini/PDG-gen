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

        for(int i=0;i<n;i++){
            if(b[i]){
                for(int j=i+1;j<n;j++){
                    if(b[j]) {
                        if (a[j] == a[i]) {
                            b[j] = false;
                            b[i] = false;
                            break;
                        }
                        if (a[j] % a[i] == 0) {
                            b[j] = false;
                        }
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
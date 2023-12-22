import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        Arrays.fill(b,1);
        int ans = 0;
        for(int i=0;i<n;i++){
            a[i]=scn.nextInt();
        }

        Arrays.sort(a);

        for(int i=0;i<n;i++){
            if(b[i]==0){
                break;
            }
            for(int j=i+1;j<n;j++){
                if(a[j]==a[i]){
                    b[i]=0;
                }
                if(b[j]==0){
                    break;
                }
                if(a[j]%a[i]==0){
                    b[j]=0;
                }
            }
        }
        for(int i=0;i<n;i++){
            ans +=b[i];
        }

        System.out.println(ans);

        scn.close();

    }

}
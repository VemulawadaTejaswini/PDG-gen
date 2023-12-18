import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] l = new int[n];
        for(int i=0;i<n;i++)l[i]=sc.nextInt();

        Arrays.sort(l);
        int ans=0;

        for(int i=0;i<n;i++)for(int j=i+1;j<n;j++)for(int k=j+1;k<n;k++){
            int[] side = new int[3];
            side[0]=l[i];
            side[1]=l[j];
            side[2]=l[k];
            Arrays.sort(l);
            if(side[2]<side[0]+side[1]){
                ans++;
            }
        }

        System.out.println(ans);
    }




}



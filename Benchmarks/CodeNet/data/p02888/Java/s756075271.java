import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for(int i=0;i<n;i++)l[i]=sc.nextInt();

        Arrays.sort(l);
        long ans=0;

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                int max = l[i]+l[j]-1;
                int c = Arrays.binarySearch(l,j+1,n,max);
                if(c<0)c=-(c+2);
                if(c>j)ans+=c-j;
            }
        }

        System.out.println(ans);
/*
        int[] a = {0,2,4,8,50,60,70};
        int k= Arrays.binarySearch(a,3,a.length,4);
        System.out.println(k);
        
 */
    }

}



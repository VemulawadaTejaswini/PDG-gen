import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for(int i=0;i<n;i++)l[i]=sc.nextInt();

        Arrays.sort(l);
        int ans=0;

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                int max = l[i]+l[j]-1;
                int min = Math.abs(l[i]-l[j])+1;

                int indexMax= Arrays.binarySearch(l,max);
                int indexMin = Arrays.binarySearch(l,min);

                if(indexMin<0)indexMin = -(indexMin+1);
                if(indexMax<0)indexMax=-(indexMax+1);

                if(indexMax<0)indexMax*=-1;

                indexMin = Math.max(j + 1, indexMin);
                indexMax = Math.min(indexMax,l.length);

                if(indexMax>=indexMin)ans+=indexMax-indexMin;
                if(indexMax==indexMin)ans++;

            }
        }

        System.out.println(ans);


    }




}



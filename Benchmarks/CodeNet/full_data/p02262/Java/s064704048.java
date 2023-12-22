import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main{
    static int[] G = {1, 4, 13, 40, 121, 364, 1093, 3280, 9841, 29524, 88573, 265720, 797161}; //G(n)=3G(n)+1
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        for(int i=0; i<n; i++){
            A[i] = Integer.parseInt(br.readLine());
        }

        shellSort(A);
    }

    static int get_g(int x){
        int low = 0;
        int high = G.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(mid==G.length-1||(G[mid]<=x&&G[mid+1]>x)){
                return mid;
            }else if(G[mid]>x){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return 0;
    }

    static void shellSort(int[] A){
        int count=0;
        int m = get_g(A.length);
        System.out.println(m+1);
        for(int i=m; i>-1; i--){
            System.out.print(G[i]);
            count=insertionSort(A, G[i], count);
            System.out.print(i!=0?" ":"\n");
        }
        System.out.println(count);
        for(int a:A){
            System.out.println(a);
        }
    }

    static int insertionSort(int[] A,int gap, int count){
        for(int i=gap; i<A.length; i++){
            int key = A[i];
            int j = i-gap;
            while(j>-1 && A[j]>key){
                A[j+gap]=A[j];
                j=j-gap;
                count++;
            }
            A[j+gap]=key;
        }    
        return count;
    }
}


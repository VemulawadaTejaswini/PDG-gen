import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long p=1000000007;
        long k=0+sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        //int popopo[]=a.clone();
        long ans=sort(a)%p;
        int b[]=new int[2*n];
        for(int i=0;i<2*n;i++)b[i]=a[i%n];
        long ans2=sort(b)%p;
        
        System.out.println(((k*ans)%p+((ans2)*(((k*(k-1))%p)/2)%p)%p)%p);
    }
    public static long sort(int[] array) {
        long ans=0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    ans++;
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
             }
        }
        return ans;
    }
    
    
    
}

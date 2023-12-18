
import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
       }
       int b[]=new int[n];
       for(int i=0;i<n;i++){
           b[i]=sc.nextInt();
       }
       List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			list.add(a[i]);
		}
       boolean ans=true;
       int maxa=0;
        int maxb=0;

       Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            if(maxa<a[i]) maxa=a[i];
            if(maxb<b[i]) maxb=b[i];
           }
           if(maxa>maxb) ans=false;
           for(int i=0;i<n;i++){
            if(a[i]>b[i]) ans=false;
           }
       
       
       
		Collections.sort(list);
		BIT bitC = new BIT(n);
		long test = 0;
		for(int i = 0; i < n; i++) {
			a[i] = Collections.binarySearch(list, a[i]) + 1;
			test += i - bitC.sum(a[i]);
			bitC.add(a[i], 1);
        }
        
        
        
        if(test>n-2) ans=false;
        
        if(ans) System.out.println("Yes");
        else System.out.println("No");
        

    }
        static class BIT{
            int []bit;
            int n;
            public BIT(int n) {
                this.n = n;
                bit = new int[n + 1];
            }
            int sum(int i) {
                int sum = 0;
                while(i > 0) {
                    sum += bit[i];
                    i -= i & -i;
                }
                return sum;
            }
            void add(int i, int x) {
                while(i <= n) {
                    bit[i] += x;
                    i += i & -i;
                }
            }
    }
}


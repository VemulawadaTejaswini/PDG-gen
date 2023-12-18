import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
 
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<n; i++) b[i] = sc.nextInt();
        for(int i = 0; i<n; i++) c[i] = sc.nextInt();
 
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
 
       for(int ca:a) System.err.print(ca + " ");
       System.err.println();
       for(int cb:b) System.err.print(cb+ " ");
       System.err.println();
       for(int cc:c) System.err.print(cc+ " ");
       System.err.println();
 
        long ans = 0;
        for(int i = 0; i<n; i++) {
            System.err.print("i=");
            System.err.println(i);

            int x = countCandy(a, b[i], 1);
            System.err.print("x=");
            System.err.println(x);
            
            int y = countCandy(c, b[i], 1);
            System.err.print("y=");
            if ( (y != n )&& c[y] == b[i]) y++;
          	y = n-y;
            System.err.println(y);

          	
            //System.out.println(x +" "+ y);
            ans += (long)x*(long)y;
        }
        System.out.println(ans);
 
    }
    public static int countCandy(int[] sortedA, int num, int a) {
        int head = 0;
        int end = sortedA.length-1;
        int middle = (head+end)/2;
 
        while(head<=end) {
            if(sortedA[middle]==num) {
                if(a==1) return middle;
                else return sortedA.length - middle-1;
            }
            else if(sortedA[middle]<num) {
                head = middle+1;
                middle = (head+end)/2;
            }else {
                end = middle-1;
                middle = (head+end)/2;
            }
        }
        if(a==1) {
            if (end == sortedA.length-1) {
                return sortedA.length;
            }
            return end+1;
        }
        else return sortedA.length - head;
 
    }
}
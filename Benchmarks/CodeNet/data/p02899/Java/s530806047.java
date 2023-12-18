import java.util.*;
class C{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            int v;
            v=sc.nextInt();
            a[v-1]=i+1;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),count=0;
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=n-1;j>i;j--){
                if(a[j-1]>a[j]){
                    int k=a[j-1];
                    a[j-1]=a[j];
                    a[j]=k;
                    count++;
                }
            }
        }
        System.out.print(a[0]);
        for(int i=1;i<n;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println("\n"+count);
    }
}

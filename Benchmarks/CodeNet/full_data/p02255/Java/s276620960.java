import java.util.Scanner;
 
public class Main {
    public static void sort(int[] a,int i){
        int key=a[i];
        int j=i-1;
        while(j>=0 && a[j]>key){
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=key;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sort(a,i);
            for(int k=0;k<n-1;k++){
                System.out.print(a[k]+" ");
            }
            System.out.println(a[n-1]);;
        }
    }
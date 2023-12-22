import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            int[] bSort = new int[n];
            for(int i = 0;i < n;i++){
                bSort[i] = scan.nextInt();
            }
            int count = 0;
            for(int i = 0;i < n;i++){
                for(int j = n-1;j > i;j--){
                    if(bSort[j] < bSort[j-1]){
                        swap(bSort,j,j-1);
                        count++;
                    }
                }
            }
            PrintOut(bSort,n);
            System.out.println(count);
        }
    }
     
    public static void swap(int[] a,int i,int j){
        int t = a[j];a[j] = a[i];a[i] = t;
    }
     
    public static void PrintOut(int[] a,int n){
        for(int i = 0;i < n;i++){
            System.out.print(a[i] + ((i == n-1)?"\n":" "));
        }
    }
}
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        sc.reset();
        for(int i = 0; i<n;i++){
            a[i] = sc.nextInt();
        }
        insertionSort(a,n);
//        System.out.println(Arrays.toString(a));
    }

    static void insertionSort(int[] arrays, int n){
        showArrays(arrays);
        int i,j,v;
        for(i=1;i<n;i++){
            v=arrays[i];
            j=i-1;
            while(j>=0 && arrays[j]>v){
                arrays[j+1] = arrays[j];
                j--;
            }
            arrays[j+1] = v;
            showArrays(arrays);
        }
    }

    static void showArrays(int[] arrays){
        String str = "";
        for(int a: arrays){
            str += Integer.toString(a)+ " ";
        }
        System.out.println(str.trim());
    }
}
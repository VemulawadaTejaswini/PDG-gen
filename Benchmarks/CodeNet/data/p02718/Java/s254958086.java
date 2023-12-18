import java.util.Scanner;
import java.lang.Math;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        double aa = 0;
        for(int i = 0; i<n ; i++){
            a[i]=sc.nextInt();
            aa = aa + a [i];
        }
        sc.close();

        a = sort(a);
        if(a[m-1] >= aa/(4.0*m)){
            System.out.println("Yes");          
        }else{
            System.out.println("No");
        }
    }
    public static int[] sort(int[] a){
        int x;
        for(int i=0;i<a.length;i++){
            x = a[i];
            for(int j=0;j<a.length;j++){
                if(x == Math.max(x,a[j])){
                    a[i]=a[j];
                    a[j]=x;
                    x=a[i];
                }
            }
        }
        return a;
    }
}
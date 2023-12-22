import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }

        for(int i = 1;i < n;i++){
            if(a[i - 1] != a[i])    System.out.print(a[i - 1]+" ");
        }
        System.out.println(a[a.length - 1]);
    }
}

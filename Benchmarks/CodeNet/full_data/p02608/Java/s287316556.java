import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100000];
        for (int x=1;x<100;x++){
            for (int y=1;y<100;y++){
                for (int z=1;z<100;z++){
                    a[x*x+y*y+z*z+x*y+y*z+z*x]++;
                }
            }
        }
        for (int i=1;i<=n;i++)System.out.println(a[i]);
    }
}

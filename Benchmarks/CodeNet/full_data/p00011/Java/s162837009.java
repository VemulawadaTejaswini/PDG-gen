import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[w];
        for(int i=0;i<a.length;i++){
            a[i] = i+1;
        }
        
        int x,y,z;
        for(int i=0;i<n;i++){
            String s = sc.next();
            String[] s1 = s.split(",");
            x = Integer.parseInt(s1[0])-1;
            y = Integer.parseInt(s1[1])-1;
            z = a[x];
            a[x]=a[y];
            a[y]=z;
        }
        for(int i=0;i<w;i++){
            System.out.println(a[i]);
        }
        sc.close();
    }
}

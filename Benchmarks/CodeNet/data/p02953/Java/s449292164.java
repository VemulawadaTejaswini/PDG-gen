import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i=0;i<n;i++)h[i]=sc.nextInt();
        boolean b = true;

        for (int i=1;i<n&&b;i++){
            while (i<n&&h[i-1]<=h[i])i++;
            if (i<n)h[i-1]--;
            if (i<n&&(h[i-1]>h[i]||(i>1&&h[i-2]>h[i-1])))b=false;
        }
        if (b)System.out.println("Yes");
        else System.out.println("No");
    }
}

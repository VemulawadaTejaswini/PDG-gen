import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int n=1;n<=m;n++){
            int ans = 0;
            for (int x=1;x<n;x++){
                for (int y=1;y<n;y++){
                    for (int z=1;z<n;z++){
                        if (x*x+y*y+z*z+x*y+y*z+z*x==n)ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}

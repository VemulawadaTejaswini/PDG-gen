import java.util.*;

public class Main{
    static int x;
    static int y;
    static int s;
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int r[] = new int[n];
        for(int i=0; i < n; i++){
            r[i] = a.nextInt();
        }
        x = r[0];
        for(int i=1; i<n; i++){
            if(i < n-1 && x > r[i]){
                x = r[i];
                s = i;
            }
            else if(i > s && y < r[i]){
                y = r[i];
            }
            else{
                continue;
            }
        }
        System.out.println(y-x);
    }
}

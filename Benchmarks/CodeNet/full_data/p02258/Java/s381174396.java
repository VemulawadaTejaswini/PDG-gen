import java.util.*;

public class Main{
    static int MAX;
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int r[] = new int[n];
        for(int i=0; i < n; i++){
            r[i] = a.nextInt();
        }
        MAX = r[1] - r[0];
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(MAX < r[j] - r[i]){
                    MAX = r[j] - r[i];
                }
            }
        }
        System.out.println(MAX);
    }
}

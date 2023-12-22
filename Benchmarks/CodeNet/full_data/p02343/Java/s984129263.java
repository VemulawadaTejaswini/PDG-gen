import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int [] L = new int [n];
        for(int i=0;i<n;i++) L[i] = i;
        for(int i=0;i<q;i++){
            int cmd = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(cmd==0){
                int X = L[x];
                int Y = L[y];
                for(int j=0;j<n;j++)if(L[j]==Y)L[j] = X;
            }
            else{
                if(L[x]==L[y]) System.out.println(1);
                else System.out.println(0);
            }
        }
    }
}

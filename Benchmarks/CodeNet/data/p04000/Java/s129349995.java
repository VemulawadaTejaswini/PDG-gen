import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(1);
        a.add(H-2);
        b.add(1);
        b.add(W-2);
        if(H>=4){
            a.add(2);
            a.add(H-3);
        }
        if(W>=4){
            b.add(2);
            b.add(W-3);
        }
        
        int[][] Block = new int[N][2];
        for(int i=0;i<N;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            Block[i][0] = x;
            Block[i][1] = y;
            if(x>=3&&x<=H-2){
                for(int j=x-2;j<=x;j++){
                    a.add(j);
                }
            }
            if(y>=3&&y<=W-2){
                for(int j=y-2;j<=y;j++){
                    b.add(j);
                }
            }
        }
        Set<Integer> set1 = new HashSet<>(a);
        Set<Integer> set2 = new HashSet<>(b);
        List<Integer> a2 = new ArrayList<>(set1);
        List<Integer> b2 = new ArrayList<>(set2);
        
        int[] J = new int[10];
        
        for(int i:a2){
            for(int j:b2){
                int sum = 0;
                for(int s=0;s<N;s++){
                    int x = Block[s][0];
                    int y = Block[s][1];
                    if(x>=i&&x<=i+2&&y>=j&&y<=j+2){
                        sum ++;
                    }
                }
                J[sum] ++;
            }
        }
        int sum = 0;
        for(int i=1;i<10;i++){
            sum += J[i];
        }
        J[0] = (H-2)*(W-2)-sum;
        
        for(int i=0;i<10;i++){
            System.out.println(J[i]);    
        }
        
    }
}

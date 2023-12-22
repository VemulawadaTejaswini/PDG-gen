import java.util.*;

public class Main{
    Scanner in = new Scanner(System.in);

    String[] T = {"the", "that", "this"};

    void solve(){
        int[] a = new int[5];
        for(int i = 0; i < 5; i++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        for(int i = 4; i >= 0; i--){
            if(i != 4) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        new Main().solve();    
    }
}
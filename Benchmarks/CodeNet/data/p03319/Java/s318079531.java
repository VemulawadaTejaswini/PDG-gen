import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        double min = 0;
        for(int i = 0; i < n; i++){
            if(Integer.parseInt(sc.next()) == 1){
                min = i;
            }
        }
        
        int ans = 0;
        ans += (int)Math.ceil((n-(n-min)) / (k-1));
        ans += (int)Math.ceil((n-(min+1)) / (k-1));
        
        System.out.println(ans);
    }
}
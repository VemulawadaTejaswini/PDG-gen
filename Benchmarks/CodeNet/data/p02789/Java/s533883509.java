import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int min=200001;
        int ans = 0;
        for(int i=0;i<N;i++){
            int a = scan.nextInt();
            if(a<min){
                min=a;
                ans++;
            }
        }
        System.out.println(ans);
    }
}

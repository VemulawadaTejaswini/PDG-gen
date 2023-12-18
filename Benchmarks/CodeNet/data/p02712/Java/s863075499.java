import java.util.Scanner;
public class Main {
     public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans = 0;
        
        for(int i = 0;i < N;i++){
            if((i+1) % 3 == 0|| (i+1) % 5 == 0){
                
            }else{
                ans = ans + (i + 1);
            }
            //System.out.println(i + "=" + ans);
        }
        
        System.out.print(ans);
     }
}
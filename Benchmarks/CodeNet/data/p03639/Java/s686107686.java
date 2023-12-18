import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div4 = 0;
        int div2 = 0;
        int odd = 0;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(a % 4 == 0){
                div4++;
            }else if(a % 2 == 0){
                div2++;
            }else{
                odd++;
            }
        }
        if(n/2 <= div4 || (n/2+n%2)-div4 <= div2/2 || n == div2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

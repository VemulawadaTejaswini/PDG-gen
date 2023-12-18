import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        int available = 1 ;
        int ans =0;
        while(available<b){
            available += a - 1 ;
            ans++ ;
            
            
        }
        System.out.println(ans);
    }
    
  
}

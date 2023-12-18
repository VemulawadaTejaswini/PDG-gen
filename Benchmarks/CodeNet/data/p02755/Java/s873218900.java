import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        int ans = -1;
        for(int i = 1; i <= 1250; i++){
            if(i * 2 / 25 == a && i / 10 == b){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
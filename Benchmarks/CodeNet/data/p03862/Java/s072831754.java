import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int x = scan.nextInt();
        int l = scan.nextInt();
        int cnt = 0;
        for(int i=1; i<n; i++){
            int a = scan.nextInt();
            while((a + l) > x){
                if(a > 0) a--;
                else l--;
                cnt++;
            }
            l = a;
        }
        System.out.println(cnt);

        scan.close();
    }
}
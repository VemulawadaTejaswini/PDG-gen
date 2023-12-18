import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
    
        int n = scan.nextInt();
        int d = scan.nextInt();
        int x = scan.nextInt();

        int sum = 0;
        for(int i=0; i<n; i++){
            int a = scan.nextInt();
            for(int j=1; j<=d; j+=a){
                sum++;
            }
        }

        System.out.println(sum + x);
        
        
        scan.close();
    
    }

}
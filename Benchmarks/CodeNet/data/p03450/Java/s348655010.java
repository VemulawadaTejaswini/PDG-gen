import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] x = new int[n];

        boolean flg = true;
        for(int i=0; i<m; i++){
            int l = scan.nextInt();
            int r = scan.nextInt();
            int d = scan.nextInt();
            
            if(!flg) continue;

            if(i==0) x[l-1] = 1;
            if((x[r-1] - x[l-1]) != d && x[r-1] != 0){
                flg = false;
                continue;
            }
            x[r-1] = x[l-1] + d;

        }

        if(flg) System.out.println("Yes");
        else System.out.println("No");

        scan.close();
    
    }

}
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int cnt = 0;

        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = scan.nextInt();
        }
        boolean flg = true;
        while(flg){
            for(int i=0; i<n; i++){
                if(array[i]%2==0) array[i] /= 2;
                else{
                    flg = false;
                    break;
                }
            }
            if(flg) cnt++;
        }

        scan.close();
        System.out.println(cnt);
    }
}
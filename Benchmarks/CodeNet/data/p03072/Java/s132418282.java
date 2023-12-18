import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            h[i] = sc.nextInt();
        }
        int s = 0 ;
        for(int i = 0 ; i < n ; i++ ){
            boolean ip = true;
            for(int j = 0 ; j < i && ip == true ; j++ ){
                if(h[i] < h[j]){
                    ip = false;
                }
            }
            if(ip == true){
                s++;
            }
        }
        System.out.println(s);
        sc.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            int[] s = new int[n];
            for(int i = 0; i < n; i++){
                s[i] = sc.nextInt();
            }
            int MAX = 0;
            int min = 1001;
            for(int i = 0; i < n; i++){
                if(s[i] > MAX){
                    MAX = s[i];
                }
                if(s[i] < min){
                    min = s[i];
                }    
            }
            int Ave = 0;
            for(int i = 0; i < n; i++){
                Ave += s[i];
            }
            Ave -= (MAX + min);
            Ave /= (n - 2);
            System.out.println(Ave);
        }
    }
}

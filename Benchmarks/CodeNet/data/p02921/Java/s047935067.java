import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] forecasts = sc.nextLine().toCharArray();
        char[] facts = sc.nextLine().toCharArray();
        int cnt = 0;
        for(int i=0;i<3;i++){
            if(forecasts[i]==facts[i]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
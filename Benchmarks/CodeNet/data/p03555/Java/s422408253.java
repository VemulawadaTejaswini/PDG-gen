import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String w1=sc.nextLine();
        String w2=sc.nextLine();
        for(int i=0;i<3;i++){
            if(w1.charAt(i)!=w2.charAt(2-i)){
                System.out.println("NO");
                break;
            }
            if(i==2)System.out.println("YES");
        }
    }
}

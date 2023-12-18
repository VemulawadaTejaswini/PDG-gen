import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<=N/4; i++){
            for(int j=0; j<=N/7; j++){
                if(N==4*i+7*j){
                    System.out.println("Yes");
                    return; 
                }
            }
        }
        System.out.println("No");
    }
}
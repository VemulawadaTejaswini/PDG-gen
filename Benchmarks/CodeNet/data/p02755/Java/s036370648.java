import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        boolean check = false;
        for(int i=1;i<=1009;i++){
            if(Math.floor(i*0.08)==A&&Math.floor(i*0.1)==B){
                System.out.println(i);
                check = true;
                break;
            }
        }
        if(!check) System.out.println(-1);
    }
}
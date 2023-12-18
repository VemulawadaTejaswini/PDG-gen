import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean assess =false;
        for(int i=1;i<=9;i++){
            if(N%i==0&&(double)N/i<=9) {
                System.out.println("Yes");
                assess=true;
                break;
            }
        }
    if(!assess) System.out.println("No");
    }
}
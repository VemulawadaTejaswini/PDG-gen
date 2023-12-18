import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int j = 0;
        boolean flag = false;
        for(int i = 0; i < 25; i++){
            j = (n-4*i)/7;
            if(4*i+7*j == n && 0 <= j){ 
                flag = true;
                break;
            }
        }
        if(flag)System.out.println("Yes");
        else System.out.println("No");
    }
}
import java.util.*;

public class Main {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while(true){
            int x = sc.nextInt();
            if(x != 0){
                System.out.printf("Case %d: %d\n", n, x);
                n++;
            }else{
                break;
            }
        }
        sc.close();
    }
}

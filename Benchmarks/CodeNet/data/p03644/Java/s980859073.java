import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int kai = 1;
        for(int i = 0; i < N ; i++){
            kai = kai * 2;
            if(kai > N){
                kai = kai / 2;
                break;
            }
        }
        System.out.println(kai);
    }
}
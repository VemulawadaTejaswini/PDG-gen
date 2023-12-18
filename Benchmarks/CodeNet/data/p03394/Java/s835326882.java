import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int tmp = 2;
        for(int i=0; i<n-1; i++){
            while(true){
                if(tmp%2==0 || tmp%3==0 || tmp%5==0){
                    System.out.print(tmp + " ");
                    sum += tmp;
                    tmp++;
                    break;
                }
                tmp++;
            }
        }
        for(int i=tmp; i<=50000; i++){
            if((sum+i)%(2*3*5) == 0){
                System.out.println(i);
                return;
            }
        }
    }
}
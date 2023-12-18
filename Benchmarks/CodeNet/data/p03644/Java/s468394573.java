import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i=0;
        int num = 1;
        while(num <= N){
            i++;
            num*=2;
        }
        i--;
        System.out.println((1<<i));
    }
}

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        for(int i=0; i<B; i++){
            if((A*(i+1))%B==C){
                System.out.println("YES");
                break;
            }
            if(i==B-1){
                System.out.println("NO");
            }
        }

    }
}
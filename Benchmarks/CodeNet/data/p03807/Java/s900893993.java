import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int odd = 0;
        for(int i=0; i<N; i++){
            int tmp = sc.nextInt();
            if(tmp%2==1)odd++;
        }
        if(odd%2==1){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}

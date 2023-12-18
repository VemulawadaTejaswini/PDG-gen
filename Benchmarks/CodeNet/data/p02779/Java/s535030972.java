import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] L = new int[1000000001];
        boolean check = true;
        Arrays.fill(L,0);
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            if(L[num]==1){
                check = false;
                break;
            }
            else  L[num]=1;
        }
        if(check) System.out.println("YES");
        else System.out.println("NO");
    }
}
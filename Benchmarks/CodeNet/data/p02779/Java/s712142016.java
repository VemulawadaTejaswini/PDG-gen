import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] L = new int[N];
        boolean check = true;
        for(int i=0;i<N;i++) L[i] = sc.nextInt();
        whole:for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(L[i]==L[j]){
                    check = false;
                    break whole;
                }
            }
        }
        if(check) System.out.println("YES");
        else System.out.println("NO");
    }
}
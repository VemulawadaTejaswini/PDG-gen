import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int[] A = new int[S.length()];
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == 'B'){
                A[i] = 1; //黒は1
            } else {
                A[i] = 0; //白は0
            }
        }
        int ans = -1;
        int flag = 0;
        while(flag == 0){
            if(A[0] == 1){
                int i = 0;
                while(A[i] != 0){
                    A[i] = 0;
                    i++;
                    if(i == A.length){
                        flag = 1;
                        break;
                    }
                }
            } else {
                int i = 0;
                while(A[i] != 1){
                    A[i] = 1;
                    i++;
                    if(i == A.length){
                        flag = 1;
                        break;
                    }
                }
            }
            ans++;
        }
        System.out.println(ans);
    }
}

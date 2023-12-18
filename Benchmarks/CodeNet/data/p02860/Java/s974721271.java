import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        String S = sc.next();
        if(N%2!=0) System.out.println("No");
        else{
            boolean check = true;
            for(int i=0;i<N/2;i++){
                if(S.charAt(i)!=S.charAt(i+N/2)){
                    check = false;
                    break;
                }
            }
            if(check) System.out.println("Yes");
            else System.out.println("No");
        }

    }
}

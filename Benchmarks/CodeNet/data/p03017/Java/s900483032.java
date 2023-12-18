import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        String S = sc.next();
        sc.close();

        if(C < D){
            for(int i = A; i < D; i++){
                if(S.charAt(i) == '#' && S.charAt(i+1) == '#'){
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        } else {
            for(int i = A; i < C; i++){
                if(S.charAt(i) == '#' && S.charAt(i+1) == '#'){
                    System.out.println("No");
                    return;
                }
            }
            for(int i = B-1; i < D; i++){
                if(S.charAt(i) == '.' && S.charAt(i-1) == '.' && S.charAt(i+1) == '.'){
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");
        }
   }
}
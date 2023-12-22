import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        String sol;
        if(A/D == B/C){
            if(A%D != 0 && C%B == 0){
                sol ="No";
            }else sol = "Yes";
        }
        if(A/D > C/B){
            
            System.out.println("Yes");
        }else System.out.println("No");



    }
}
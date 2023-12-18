import java.util.*;

class Main{
    public static void main(String[] args){
        int A, B, C, D = 0;
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        
        if(A+B-C-D>0){
            System.out.println("Left");
        }else if(A+B-C-D==0){
            System.out.println("Balanced");
        }else{
            System.out.println("Right");
        }
    }
}
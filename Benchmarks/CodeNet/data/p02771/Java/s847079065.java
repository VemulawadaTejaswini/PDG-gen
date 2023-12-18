import java.util.*;
class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a,b,c = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a == b && b == c){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        
    }
}
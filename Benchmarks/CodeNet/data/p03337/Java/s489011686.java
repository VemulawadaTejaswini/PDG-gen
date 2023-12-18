import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a-b;
        int y = b-a;
        int z = a*b;

        if(x >= y && x >= z){
            System.out.println(x);
        }else if(y >= x && y >= z){
            System.out.println(y);
        }else if(a == b ){
            System.out.println(z);
        }else{
            System.out.println(z);
        }
    }
}
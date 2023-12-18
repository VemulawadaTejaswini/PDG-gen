import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ama = n%k;
        if(ama >= 1){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
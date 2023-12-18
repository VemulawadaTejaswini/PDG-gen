import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = k / 2;
        int q = k % 2;
        if(q==0){
            System.out.println(n*n);
        }
        else{
            System.out.println(n*(n+1));
        }
    }
}
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n/7;i++){
            if((n-7*i)%4==0){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
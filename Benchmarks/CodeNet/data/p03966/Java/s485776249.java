import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        int b=1;
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int j;
            for(j=1;;j++){
                if(x*j>=a&&y*j>=b){
                    break;
                }
            }
            a=x*j;
            b=y*j;
        }
        System.out.println(a+b);
        
    }
}
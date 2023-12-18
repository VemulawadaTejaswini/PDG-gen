import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int cnt  =0;
        int num = 0;

        if(a<k){
            cnt+=a;
            k-=a;
        }else if(k!=0){
            cnt=a;
            k=0;
        }
        
        if(k!=0&& b<k){
            k-=b;
        }else if(k!=0){
            k=0;
        }
       // System.out.println(cnt);
        
        if(k!=0&& c<k){
            cnt-=k;
        }else if(k!=0){
            cnt-=k;
        }
        System.out.println(cnt);


    }
}





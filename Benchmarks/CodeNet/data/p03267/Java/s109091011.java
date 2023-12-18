import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        int r=1;
        int cot=0;
        
        while(r<=L){
            r*=2;
            cot++;
        }
        cot--;
        r/=2;
        r--;
        L-=r;
        
        if(L==0){
            System.out.print((cot+1)+" ");
            System.out.println(2*(cot));
        }else{
            System.out.print((cot+2)+" ");
            System.out.println(2*(cot+1));
        }
        
        System.out.println("1 2 "+L);
        System.out.println("1 2 0");
        
        int idx=2;
        r++;
        r/=2;
        
        while(r!=1){
            System.out.println(idx+" "+(idx+1)+" "+r);
            System.out.println(idx+" "+(idx+1)+" 0");
            r/=2;
            idx++;
        }
        
        r=1;
        
        System.out.println(idx+" "+(idx+1)+" "+r);
        System.out.println(idx+" "+(idx+1)+" 0");
    }
}

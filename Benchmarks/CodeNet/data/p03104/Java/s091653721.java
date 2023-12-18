import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        boolean aflag=false;
        boolean bflag=false;
        if(a%2==0){
            a++;
            aflag=true;
            
        }
        if(b%2==1){
            b--;
            bflag=true;
        }
        
        long[] ns=new long[40];
        ns[0]=b-a+1;
        for(int i=1;i<40;i++){
            ns[i]=(long)(b/Math.pow(2,i))-(long)(a/Math.pow(2,i));
            ns[i-1]-=ns[i];
        }
        boolean[] ns2=new boolean[40];
        for(int i=1;i<40;i++){
            if(ns[i]%2==1){
                ns2[i]=true;
            }
        }
        long output=0;
        for(int i=1;i<40;i++){
            if(ns2[i]){
                output=output^((long)Math.pow(2, i+1)-1);
            }
        }
        if(aflag){
            output=output^(a-1);
        }
        if(bflag){
            output=output^(b-1);
        }
        System.out.println(output);

    }
    

}
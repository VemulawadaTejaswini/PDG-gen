import java.util.*;

public class Main {
    public static String reverse(String S){
        int len=S.length();
        String T="";
        for(int i=len-1;i>=0;i--){
            T+=S.charAt(i);
        }
        return T;
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        String T=S;
        int Q=sc.nextInt();
        boolean isReverse=false;
        for(int i=0;i<Q;i++){
            int tmp=sc.nextInt();
            if(tmp==1){
                if(isReverse){
                    isReverse=false;
                }else{
                    isReverse=true;
                }
            }else{
                int tmp2=sc.nextInt();
                String tmpstring=sc.next();
                char tmpchar=tmpstring.charAt(0);
                if(tmp2==1){
                    if(isReverse){
                        T+=tmpchar;
                    }else{
                        S=tmpchar+T;
                        T=S;
                    }
                }else{
                    if(isReverse){
                        S=tmpchar+T;
                        T=S;
                    }else{
                        T+=tmpchar;
                    }
                }
            }
        }
        
        if(isReverse){
            T=reverse(T);
        }
        
        System.out.println(T);
    }
}

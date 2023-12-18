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
        StringBuilder sbbefore=new StringBuilder();
        StringBuilder sbafter=new StringBuilder();
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
                        sbafter.append(tmpstring);
                    }else{
                        sbbefore.append(tmpstring);
                    }
                }else{
                    if(isReverse){
                        sbbefore.append(tmpstring);
                    }else{
                        sbafter.append(tmpstring);
                    }
                }
            }
        }
        
        String before=sbbefore.toString();
        before=reverse(before);
        String T=before+S+sbafter.toString();
        
        if(isReverse){
            T=reverse(T);
        }
        
        System.out.println(T);
    }
}

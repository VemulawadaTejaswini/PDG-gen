import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner stdIn = new Scanner(System.in);
        int N =stdIn.nextInt();
        String s="";
        if(N==0)s+=0;
        while(N!=0){
            if(N>0){
                if(N%2==1){
                    N--;
                    N=N/2;
                    N=-N;
                    s ="1"+s;
                }else{
                    N=N/2;
                    N=-N;
                    s ="0"+s;
                }
            }else{
                if(N%2==-1){
                    N--;
                    N=N/2;
                    N=-N;
                    s ="1"+s;
                }else{
                    N=N/2;
                    N=-N;
                    s ="0"+s;
                }
            }
        }
        System.out.println(s);
    }
}

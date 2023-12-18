import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String S=sc.next();
        long w=0,res=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='W') {
                res+=i-w;
                w++;
            }
        }
        System.out.println(res);
    }
}

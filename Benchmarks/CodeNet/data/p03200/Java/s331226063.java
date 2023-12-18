import java.util.*;
class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String S=sc.next();
        int b=0,res=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='W') {
                res+=b;
            }
            else{
                b++;
            }
        }
        System.out.println(res);
    }
}
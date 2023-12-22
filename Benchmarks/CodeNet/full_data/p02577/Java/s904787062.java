import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String S=sc.next();
        int res=0;
        for(int i=0;i<S.length();i++){
            res+=S.charAt(i)-'0';
            res%=9;
        }
        System.out.println(res==0?"Yes":"No");
    }
}
import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String S=sc.next();
        int res=Integer.MAX_VALUE;
        for(int i=0;i<=S.length()-3;i++){
            res=Math.min(Math.abs(753-Integer.parseInt(S.substring(i,i+3))),res);
        }
        System.out.println(res);
    }
}
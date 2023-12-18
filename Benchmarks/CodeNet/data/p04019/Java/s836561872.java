import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean ans = true;
        if(s.indexOf("W")!=-1&&s.indexOf("E")==-1){
            ans = false;
        }
        if(s.indexOf("E")!=-1&&s.indexOf("W")==-1){
            ans = false;
        }
        if(s.indexOf("N")!=-1&&s.indexOf("S")==-1){
            ans = false;
        }
        if(s.indexOf("S")!=-1&&s.indexOf("N")==-1){
            ans = false;
        }
        System.out.println(ans?"Yes":"No");
    }
}
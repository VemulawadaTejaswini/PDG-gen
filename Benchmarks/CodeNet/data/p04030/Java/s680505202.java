import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0') res.append(0);
            else if(s.charAt(i)=='1') res.append(1);
            else{
                if(res.length()>0) res.delete(res.length()-1,res.length());
            }
        }
        System.out.println(res.toString());
    }
}

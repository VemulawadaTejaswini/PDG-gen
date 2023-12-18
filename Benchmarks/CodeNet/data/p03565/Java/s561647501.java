import java.util.*;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ss,t;
        ss = sc.next();
        StringBuffer p = new StringBuffer(ss);
        p = p.reverse();
        t = sc.next();
        StringBuffer q = new StringBuffer(t);
        q = q.reverse();
        boolean f = true;
        int head = 0;
        for(int i=0;i<p.length();i++){
            if(p.charAt(i)==q.charAt(0) || p.charAt(i)=='?'){
                head = i;
                for(int j=0;j<q.length();j++){
                    if(i+j>=p.length()){
                        f = false;
                        break;
                    }
                    if(p.charAt(i+j)==q.charAt(j) || p.charAt(i+j)=='?'){

                        f = true;
                    } else {
                        f = false;
                        break;
                    }
                }
            if(f==true) break;
            }else{
                f = false;
            }

        }

        if(f==false){
            System.out.println("UNRESTORABLE");
        } else {
            String sr = "";
            for(int i=0;i<head;i++){

                if(p.charAt(i)!='?'){
                    sr = sr + p.charAt(i);
                }else {
                    sr = sr + 'a';
                }
            }
            sr = sr + q;
            for(int i= head + q.length();i<p.length();i++){
                if(p.charAt(i)!='?'){
                    sr = sr + p.charAt(i);
                }else {
                    sr = sr+'a';
                }
            }

            StringBuffer s = new StringBuffer(sr);
            System.out.println(s.reverse());
        }


    }


}

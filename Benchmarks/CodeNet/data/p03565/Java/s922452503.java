import java.util.*;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ss,t;
        ss = sc.next();
        t = sc.next();
        boolean f = true;
        int head = 0;
        for(int i=0;i<ss.length();i++){
            if(ss.charAt(i)==t.charAt(0) || ss.charAt(i)=='?'){
                head = i;
                for(int j=0;j<t.length();j++){
                    if(i+j>=ss.length()){
                        f = false;
                        break;
                    }
                    if(ss.charAt(i+j)==t.charAt(j) || ss.charAt(i+j)=='?'){

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
            String s = "";
            for(int i=0;i<head;i++){

                if(ss.charAt(i)!='?'){
                    s = s + ss.charAt(i);
                }else {
                    s = s+'a';
                }
            }
            s = s + t;
            for(int i= head + t.length();i<ss.length();i++){
                if(ss.charAt(i)!='?'){
                    s = s + ss.charAt(i);
                }else {
                    s = s+'a';
                }
            }
            System.out.println(s);
        }


    }


}
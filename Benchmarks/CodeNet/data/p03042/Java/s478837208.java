import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        boolean a=false,b=false,c=false,d=false;
        if(Integer.parseInt(s.substring(0,2))>0&&Integer.parseInt(s.substring(0,2))<=12){
            a=true;
        }
        if(Integer.parseInt(s.substring(0,2))>0&&Integer.parseInt(s.substring(0,2))<=99){
            b=true;
        }
        if(Integer.parseInt(s.substring(2,4))>0&&Integer.parseInt(s.substring(2,4))<=12){
            c=true;
        }
        if(Integer.parseInt(s.substring(2,4))>0&&Integer.parseInt(s.substring(2,4))<=99){
            d=true;
        }
        if(!(a||c)){
            System.out.println("NA");
        }else if(a&&!c){
            System.out.println("MMYY");
        }else if((!a)&&c){
            System.out.println("YYMM");
        }else{
            System.out.println("AMBIGUOUS");
        }
 
    }

}
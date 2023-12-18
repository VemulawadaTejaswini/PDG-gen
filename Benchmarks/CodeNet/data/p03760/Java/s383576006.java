import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = "";
        
        if(a.length()>b.length()){
            for(int i =0;i<a.length();i++){
                c+=a.charAt(i);
                if(i==a.length()-1){
                    break;
                }
                c+=b.charAt(i);
            }

        }else{
            for(int i =0;i<a.length();i++){
                c+=a.charAt(i);
                c+=b.charAt(i);
            }

        }


        System.out.println(c);

    }
}





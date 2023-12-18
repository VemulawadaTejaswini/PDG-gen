import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int a=0;
        for(int l=0;l<s1.length();l++){
            char[] c1=s1.toCharArray();
            if(!s1.equals(s2)){
                //System.out.println("A");
                char ch=c1[s1.length()-1];
                for(int i=s1.length()-1;i>0;i--){
                    c1[i]=c1[i-1];
                }
                c1[0]=ch;
                s1=String.valueOf(c1);
            }
            else{
                a=1;
                break;
            }
        }
        if(a==1){
            System.out.println("Yes");
        }    
        else{
            System.out.println("No");
        }
    }
}
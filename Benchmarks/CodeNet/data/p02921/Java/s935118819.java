import java.util.*;
public class Main {
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    String S1=s.next();
    String S2=s.next();

    char[] t=new char[3];
    char[] t2=new char[3];
    int ans=0;
    for(int i=0;i<3;i++){
       t[i]=S1.charAt(i);
    }
    for(int i=0;i<3;i++){
        t2[i]=S2.charAt(i);
    }
    for(int i=0;i<3;i++){
        if(t[i]==t2[i]){
            ans++;
        }
    }
    System.out.println(ans);
}
}
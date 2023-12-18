import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S;
        int num=0;
        S=sc.next();
        for(int a=0;a<3;a++){
            if(S.charAt(a)=='o'){
                num++;
            }
        }
        System.out.println(700+num*100);
    }
}

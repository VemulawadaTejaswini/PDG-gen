import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String S;
        S = sc.next();
        int numone=1,numzero=1;
        char [] list = new char[S.length()];
        int [] list2 = new int[S.length()];
        for(int a=0;a<S.length();a++){
            list[a] = S.charAt(a);
            list2[a] =0;
        }
        for(int a=1;a<S.length();a++){
            if(list[a]=='1'&&list[a-1]=='1')list2[a]=list2[a-1]+1;
            else if(list[a]=='0'&&list[a-1]=='0')list2[a] = list2[a-1]+1;
            else if(list[a]=='0'&&list[a-1]=='1')list2[a] =0;
            else if(list[a]=='1'&&list[a-1]=='0') list2[a] =0;
        }
        int num =0;
        for(int a=0;a<S.length();a++){
            if(num < list2[a])num =list2[a];
        }
        if(num==0) System.out.println(2);
        else System.out.println(num+1);
    }
}

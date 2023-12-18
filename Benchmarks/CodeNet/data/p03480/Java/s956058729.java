import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String S;
        S = sc.next();
        int numone=1,numzero=1;
        char [] list = new char[S.length()];
        for(int a=0;a<S.length();a++){
            list[a] = S.charAt(a);
        }
        for(int a=1;a<S.length();a++){
            if(list[a-1]=='1'&&list[a]=='1')numone++;
            else if(list[a-1]=='0'&&list[a]=='0')numzero++;
            else if(list[a-1]=='1'&&list[a]=='0')numone=1;
            else if(list[a-1]=='0'&&list[a]=='1')numzero=1;
        }
        if(numone ==1&&numzero==1) System.out.println(2);
        else if(numone>numzero) System.out.println(numone);
        else System.out.println(numzero);

    }
}

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int [] list = new int [S.length()];
        for(int a=0;a<S.length();a++){
            if(S.charAt(a)=='B') list[a]=0;
            else list[a]=1;
        }
        int num=0;
        for(int a=0;a<S.length()-3;){
            for(int b=a;b<S.length()-1;b++){
                if (list[b] == 0 && list[b + 1] == 1) {
                    list[b] = 1;
                    list[b + 1] = 0;
                    num++;
                }
            }
            if(list[a]==1) a++;
        }
        System.out.println(num);
    }
}
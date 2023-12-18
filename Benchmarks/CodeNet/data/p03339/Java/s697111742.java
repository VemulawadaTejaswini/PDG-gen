import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char [] list = S.toCharArray();
        int min =10000000;
        for (int i=0;i<S.length();i++){
            int cnt=0;
            for(int j=0;j<S.length();j++){
                if(i ==j){
                    continue;
                }
                if(j<i){
                    if(list[j] == 'W'){
                        cnt++;
                    }
                }else{
                    if(list[j] == 'E'){
                        cnt++;
                    }
                }
            }
            if(cnt <min){
                min =cnt;
            }
        }
        System.out.println(min);
    }
}
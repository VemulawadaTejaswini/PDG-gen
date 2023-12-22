import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //入力
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        //分割
        char[] str1 = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            str1[i] = str.charAt(i);
            //System.out.println(str1[i]);
        }


        int count = -1;
        //雨が0連続で降った場合
        if(str1[0] != 'R' && str1[1] != 'R' && str1[2] != 'R'){
            count = 0;
        }
        else if((str1[0] == 'S' && str1[1] == 'S') || (str1[1] == 'S' && str1[2] == 'S') || (str1[2] == 'S' && str1[0] == 'S') || (str1[0] == 'R' && str1[1] == 'S' && str1[2] == 'R')){
            count = 1;
        }
        else if((str1[0] == 'R' && str1[1] == 'R' && str1[2] == 'S') || (str1[0] == 'S' && str1[1] == 'R' && str1[2] == 'R')){
            count = 2;
        }
        else if(str1[0] == 'R' && str1[1] == 'R' && str1[2] == 'R'){
            count = 3;
        }

        System.out.println(count);

    }
}
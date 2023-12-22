import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String answer = ""; //何も入れない場合でも""を付けないといけない
        int length = line.length();
        char a;
        for(int i=0; i<length; i++){
            a = line.charAt(i);  //文字列名.charAt(i)は文字列のi番目の文字を引っ張ってくる
            if(Character.isLowerCase(a) == true){   //文字aが小文字ならtrueを返す関数。==は省略可能
                answer += Character.toUpperCase(a);
            }else{
                answer += Character.toLowerCase(a);
            }
        }
        System.out.println(answer);
        sc.close();
    }
}

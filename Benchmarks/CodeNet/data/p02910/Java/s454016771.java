import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String s1 = "";
        String s2 = "";

        for(int i = 0 ; i < s.length()  ; i++ ){
            char c = s.charAt(i);
            if( i % 2 == 0){
                s1 += c;
            }else{
                s2 += c;
            }
        }

        if(s1.contains("L")){
            System.out.println("No");
        }else if(s2.contains("R")){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}

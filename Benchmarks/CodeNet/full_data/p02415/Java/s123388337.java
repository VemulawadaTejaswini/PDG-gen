import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            String line =sc.nextLine();
            String answer ="";
            int length=line.length();
            for(int i=0;i<length;i++){
                char ch=line.charAt(i);
                if('a'<=ch && ch<='z'){
                 ch-=32;
                }else if('A'<=ch && ch<='Z'){
                    ch+=32;
                }
               answer+=ch;
            }
            System.out.println(answer);
        }
    }
}

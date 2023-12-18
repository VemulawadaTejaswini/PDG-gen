import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String s;
        int tmp_A;
        s=scan.next();
        tmp_A=0;
        int i;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='A') {
            tmp_A=i;
            break;
            }
        }
        for(;i<s.length();i++){
            if(s.charAt(i)=='Z'){
                do{
                    i+=1;
                }
                while(s.charAt(i)=='Z');
                System.out.println(i-tmp_A);
                break;
            }
        }
    }
}
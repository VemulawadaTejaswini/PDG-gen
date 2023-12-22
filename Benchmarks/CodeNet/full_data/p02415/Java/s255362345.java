import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s =sc.nextLine();
        String answer="";
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(Character.isLowerCase(a)==true){
                a=Character.toUpperCase(a);
                answer+=a;
            }
            else{
                a=Character.toLowerCase(a);
                answer+=a;
            }
        }
        System.out.println(answer);
    }
}

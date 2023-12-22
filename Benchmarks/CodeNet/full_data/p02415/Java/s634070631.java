import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "";    
        str = sc.nextLine();
        int i;
        String result = "";
        char c;
        for(i=0;i<str.length();i++){
            c = str.charAt(i);
            if(Character.isUpperCase(c)== true) {
                c += 32;
                result += c;
            }else if(Character.isLowerCase(c)== true){
                c -= 32;
                result += c;
            }else{
                result += c;
            }
        }
        
        System.out.println(result);
        sc.close();
    }
}


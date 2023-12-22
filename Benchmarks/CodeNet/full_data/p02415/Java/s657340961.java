import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if('a'<=c&&c<='z'){
                System.out.print(Character.toUpperCase(c));
            }else{
                if('A'<=c&&c<='Z'){
                System.out.print(Character.toLowerCase(c));
                }else{
                    System.out.print(c);
                }
            }
        }
        System.out.println();
        sc.close();
    }    
}

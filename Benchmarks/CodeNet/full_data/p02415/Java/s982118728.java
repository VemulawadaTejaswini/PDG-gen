import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String changed = "";

        for(int i = 0; i < str.length(); i++){

            if(Character.isUpperCase( str.charAt(i))){
                changed += Character.toLowerCase(str.charAt(i));
            }
            else if(Character.isLowerCase( str.charAt(i))){
                changed += Character.toUpperCase(str.charAt(i));
            }
            else{
                changed += str.charAt(i);
            }
        }
        System.out.println(changed);
    }
}

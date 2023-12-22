import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            String line = sc.nextLine();
            int length = line.length();
            char result[] = new char[length];
            for(int i=0; i<length; i++){
                char ch = line.charAt(i);
                if(Character.isLowerCase(ch) == true) result[i] = Character.toUpperCase(ch);
                else if(Character.isUpperCase(ch) == true) result[i] = Character.toLowerCase(ch);
                else result[i] = ch; 
            }
            System.out.println(result);
        }
    }
}

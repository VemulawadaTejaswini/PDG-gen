import java.util.Scanner;

public class Main {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       String input = sc.nextLine(); 
       char letter[] = new char[input.length()];

       for(int i=0; i<input.length(); i++) {
           letter[i] = input.charAt(i);
           if(Character.isUpperCase(letter[i]))
            letter[i] = Character.toLowerCase(letter[i]);
           else letter[i] = Character.toUpperCase(letter[i]);
       }

        
       for(int i=0; i<input.length(); i++) System.out.print(letter[i]);
       System.out.println("");
    }
}

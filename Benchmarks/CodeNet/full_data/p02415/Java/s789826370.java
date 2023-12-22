import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char sent[] = new char[input.length()];

        for(int i=0;i<input.length();i++){
            sent[i] = input.charAt(i);
            if(Character.isUpperCase(sent[i]))
                sent[i] = Character.toLowerCase(sent[i]);
            else sent[i] = Character.toUpperCase(sent[i]);    
        }
        for(int i=0;i<input.length();i++) System.out.print(sent[i]);
        System.out.println("");
        sc.close();
    }
}

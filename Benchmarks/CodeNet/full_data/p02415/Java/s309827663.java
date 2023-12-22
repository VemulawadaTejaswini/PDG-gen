import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try(Scanner cs = new Scanner(System.in)){
            String line = cs.nextLine();
            String answer = "";
            int length = line.length();
            for(int i =0;i<length;i++){
                char ch = line.charAt(i);
                if(Character.isLowerCase(ch)){
                    System.out.print(Character.toUpperCase(ch));
                }else{
                    System.out.print(Character.toLowerCase(ch));
                }
            }
            System.out.printf("\n");
        }
    }

}

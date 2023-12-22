import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        String line  = sc.nextLine();
        
        for(int i = 0; i < line.length(); i++){
            if(Character.isLowerCase(line.charAt(i))){
                System.out.print(Character.toUpperCase(line.charAt(i)));
            }
            
            else if(Character.isUpperCase(line.charAt(i))){
                System.out.print(Character.toLowerCase(line.charAt(i)));
            }
            
            else {
                System.out.print(line.charAt(i));
            }
        }
        
        System.out.println();
    }
}

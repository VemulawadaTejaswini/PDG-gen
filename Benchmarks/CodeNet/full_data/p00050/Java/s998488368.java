import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        
        while(sc.hasNextLine()){
            String temp = sc.nextLine();
            
            
            
            temp = temp.replaceAll("apple","-");
            temp = temp.replaceAll("peach","apple");
            temp = temp.replaceAll("-","peach");
            System.out.println(temp);
        }
    }
}
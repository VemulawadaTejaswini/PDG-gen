import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        String question = scanner.next();
        String answer = scanner.next();
        
        int count = 0;
        int min = answer.length();
        for(int i=0;i<question.length()-answer.length();i++){
            for(int j=0;j<answer.length();j++){
            if(question.charAt(i+j) != answer.charAt(j)){
                count++;
            }
            }
            
            if(min > count)min = count;
            count=0;
        }
        
        System.out.print(min);
    }
}
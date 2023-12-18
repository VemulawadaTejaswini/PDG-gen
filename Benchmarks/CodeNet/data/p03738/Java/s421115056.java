
import java.util.Scanner;

public class Main {
  
//    Curriculum...
//Letters and Sounds
//English Appendix 1: Spelling
//KS3
//Curriculum word lists
//English literature study books
//Resources...
//Spellzone guides
//Spelling resources
//Dictionary
//Tools
//FAQs
//Help...
//Contact us
//Book FREE
//Help
    
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        String A = Input.next();
        String B = Input.next();
        if (A.length() == B.length()) {
            int E = 1;
            int G = 0;
            int L = 0;
            for (int I = 0; I < A.length(); I++) {
                if (A.charAt(I) == B.charAt(I)) {
                    E++;
                } else if (A.charAt(I) > B.charAt(I)) {
                    System.out.println("GREATER");
                    G++;
                    break;
                } else if (A.charAt(I) < B.charAt(I)) {
                    System.out.println("LESS");
                    L++;
                    break;
                }
            }
            if (L == 0 && G == 0) {
                System.out.println("EQUAL");
            }
        } else if (A.length() > B.length()) {
            System.out.println("GREATER");
        } else {
            System.out.println("LESS");
        }
    }
}//Keep Copying This Useless Code

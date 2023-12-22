import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int givenNumber = scan.nextInt();
        
        if (givenNumber >= 1 && givenNumber <= 100) {
            System.out.println(givenNumber ^ 3);
        }
    }
}

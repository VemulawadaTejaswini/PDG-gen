import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        String id = scanner.nextLine();
        StringBuilder addOneId = new StringBuilder(scanner.nextLine());
        StringBuilder aoi = new StringBuilder(addOneId.deleteCharAt(addOneId.length()-1));
        
        if(id.equals(aoi.toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
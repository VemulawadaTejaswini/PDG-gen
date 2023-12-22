import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws Exception {
 
//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int w = sc.nextInt();
        System.out.println(w >= s ? "unsafe":"safe");
    }
}
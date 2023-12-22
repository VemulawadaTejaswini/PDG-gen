import java.util.Scanner;
public class s9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String key = sc.nextLine();
        String test = str+str;

        if(test.contains(key)) {
        	System.out.println("Yse");
        }else {
        	System.out.println("No");
        }
        sc.close();
    }
}

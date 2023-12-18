
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        int t=scanner.nextInt();
//        for(int j=0;j<t;j++){
//            
//        }
        String s=scanner.next();
        if(s.charAt(2)==s.charAt(3) && s.charAt(4)==s.charAt(5)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

}

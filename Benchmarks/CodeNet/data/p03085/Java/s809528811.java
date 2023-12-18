import java.util.Scanner;
public class Main {
    public static void main(String[] args) {   
        String out;
        Scanner sc = new Scanner(System.in); 
        String nyu = sc.next();
        switch(nyu){
            case "A":
                out = "T";
                break;
            case "T":
                out = "A";
                break;
            case "C":
                out = "G";
                break;
            case "G":
                out = "C";
                break;
            default :
                out = "";
                break;
        }
        System.out.println(out);
    }
}
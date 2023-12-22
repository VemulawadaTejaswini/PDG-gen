import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String W = sc.next();
    while(true){
        String T = sc.next();


            if(T.equalsIgnoreCase(W)){
                count++;
            }
            if(T=="END_OF_TEXT"){
                break;
            }
        }
        System.out.println(count);
    }

}

import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suhu = scan.nextInt();
        if(suhu>=30){
            System.out.println("Yes");
        }  else{
            System.out.println("No");
        }
    }
}

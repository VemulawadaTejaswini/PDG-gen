import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = (A/1000)+1;
        int anc = ((B*1000)-A); 
        System.out.println(anc);
    }
}

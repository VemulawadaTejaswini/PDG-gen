import java.util.*;

public class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        String text = "";
        if(C >= A && C <=B){
            text = "YES";
        }else{
            text = "NO";
        }
        System.out.println(text);
	}
}
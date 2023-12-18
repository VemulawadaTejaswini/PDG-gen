import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for(int i = 0; i < b; i++){
        	int total = a * (i + 1);
            if(total % b == c){
        		System.out.println("YES");
                return;
        	}
        }
        System.out.println("NO");
    }
}
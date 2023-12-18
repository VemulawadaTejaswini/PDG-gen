import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int l = sc.nextInt();

        int index = 0;
        int abs = Math.abs(l);

        for (int i = 1; i < n; i++) {
            if (Math.abs(l + i) < abs) {
                abs = Math.abs(l + i);
                index = i;
            }
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            if (i != index) {
                result += l+i;
            }
        }

        System.out.println(result);
	}
}

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] lst = new int[n];
        int x = scan.nextInt();
        for(int a = 0; a < n; a++){
            if(a == 0){
                lst[0] = 0;
            }
            else{
                lst[a] = scan.nextInt();
            }
        }
        for (int a = 0; a < n; a++) {
            lst[a + 1] = lst[a] + lst[a + 1];
            if (lst[a + 1] > x) {
                System.out.println(a + 1);
                break;
            }
        }
    }
}

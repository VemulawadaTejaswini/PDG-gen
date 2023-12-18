import java.util.*;

public class Main {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String line = sc.next();

        int[] arr = new int[n+1];
        for(int i = 0;i < n;i++){
            if(i+2 < n){
                if(line.charAt(i) == '.' && line.charAt(i+1) == '.' && line.charAt(i+2) == '.'){
                    arr[i+1] = 1;
                }
            }
            if(i + 1 < n){
                if(line.charAt(i) == '#' && line.charAt(i+1) == '#'){
                    arr[i+1] = -1;
                }
            }
        }

        boolean ans  = true;
        for(int i = a;i < c;i++){
            if(arr[i] == -1) {
                ans = false;
                break;
            }
        }

        for(int i = b;i < d;i++){
            if(arr[i] == -1) {
                ans = false;
                break;
            }
        }

        if(d < c){
            boolean jump = false;
            for(int i = b;i < d;i++){
                if(arr[i] == 1) {
                    jump = true;
                    break;
                }
            }
            ans = ans && jump;
        }
        System.out.println(ans ? "Yes" : "No");
    }
}
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String x ="";
        for(int a=1; 1<=a && a<=9; a++) {
            for(int b=1; 1<=b && b<=9; b++) {
                if(a*b == n) {
                  x = "Yes";  
                    break;
                }
            }
        }
        if(x != "Yes") {
            x = "No";
        }
        System.out.println(x);
    }
}
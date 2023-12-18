import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        boolean sa = false;
        boolean sine = false;
        if(n % 2 != 0){
            System.out.println("No");
            sine = true;
        }else{
            int[] a = new int[n / 2];
            int[] b = new int[n / 2];
            for(int i = 0 ; i < n / 2 ; i++ ){
                a[i] = s.charAt(i);
                b[i] = s.charAt(i + n / 2);
                if(a[i] != b[i]){
                    sa = true;
                }
            }
        }
        if(sa == true){
            System.out.println("No");
        }else if(sine == false){
            System.out.println("Yes");
        }
    }
}
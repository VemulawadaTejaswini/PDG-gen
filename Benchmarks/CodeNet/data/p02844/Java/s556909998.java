import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        
        int[] first = new int[10];
        for(int i = 0; i < n-2; n++){
            String a = s.substring(i,i+1);
            first[Integer.parseInt(a)]++;
        }
        
        int[] second = new int[10];
        for(int i = 1; i < n-1; n++){
            String a = s.substring(i,i+1);
            second[Integer.parseInt(a)]++;
        }
        
        int[] third = new int[10];
        for(int i = 2; i < n; n++){
            String a = s.substring(i,i+1);
            third[Integer.parseInt(a)]++;
        }

        int a = 0;
        int b = 0;
        int c = 0;
        for(int i = 0; i < 10; i++){
            a = first[i]>0 ? a++ : a;
            b = second[i]>0 ? b++ : b;
            c = third[i]>0 ? c++ : c;
        }
        System.out.println(a * b * c);
        
    }
}

import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        ++n;
        for(int p=0; p<n; p++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            double c = a^2 + b^2;
            Math.round(c);
            if(c == k){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
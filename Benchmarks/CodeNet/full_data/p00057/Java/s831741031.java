import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            numberOfArea(n);
        }
    }
    public static void numberOfArea(int n){
        int number = 1;
        for(int i = 1; i <= n; i++){
            number += i;
        }
        System.out.println(number);
    }
}


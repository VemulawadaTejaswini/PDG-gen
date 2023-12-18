import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a,Math.max(b,c));
        int count = 0;
        if(a != max){
            count += (max - a) / 2;
            a += (max - a) / 2;
        }
        if(b != max){
            count += (max - b) / 2;
            b += (max - b) / 2;
        }
        
        if(c != max){
            count += (max - c) / 2;
            c += (max - c) / 2;
        }
        switch(max*3 - a - b - c){
            case 0:
                break;
            case 1:
                count += 2;
                break;
            case 2:
                count += 1;
                break;
        }
        System.out.println(count);
    }
}
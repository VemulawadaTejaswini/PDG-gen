import java.util.*;
 
class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        if(a > b){
            sum += a;
            a -= 1;
        }else if(a<=b){
            sum += b;
            b -= 1;
        }
              if(a > b){
            sum += a;
            a -= 1;
        }else if(a<=b){
            sum += b;
            b -= 1;
        }
System.out.println(sum);
    }
 
}
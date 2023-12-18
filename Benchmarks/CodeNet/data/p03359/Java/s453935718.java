import java.util.*;


public class Main {
    
    public static int math(int a,int b){
        if(a <= b){
            return a;
        }else{
            return a-1;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        System.out.println(math(month,day));
    }
}
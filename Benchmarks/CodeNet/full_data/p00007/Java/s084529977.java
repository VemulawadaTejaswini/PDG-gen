import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        //input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 100000;
        for(int i=0;i<N;i++){
            sum *= 1.05;
            if(sum%1000 != 0){sum += 1000 - sum % 1000;}
        }
         
         //output
        System.out.println(sum);
    }
}
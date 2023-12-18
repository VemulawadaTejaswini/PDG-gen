import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toString(n);
        String []resultArray = str.split("");
        
        int sum = 0;
        
        for (int i=0; i < resultArray.length; i++){
            int num=Integer.parseInt(resultArray[i]);
            sum += num;
        }
        
        if (n % sum == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}
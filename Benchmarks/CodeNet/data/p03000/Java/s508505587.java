import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);        
        int n = stdIn.nextInt();
        int x = stdIn.nextInt();
        int count = 1;
        int sum = 0;
        while(n-- > 0){
            sum += stdIn.nextInt();
            if(x < sum) break;
            count++;
        }
        System.out.println(count);

    }
}
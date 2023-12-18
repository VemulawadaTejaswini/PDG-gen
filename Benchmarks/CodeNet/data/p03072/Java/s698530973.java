import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        int max = 0;
        for(int i = 0; i < a; i++){
            int height = sc.nextInt();
            if(max <= height){
                count++;
                max = height;
            }
                
        }
        System.out.println(count);
    }
}

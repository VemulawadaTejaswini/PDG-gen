import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N[] = new int[5];
        for(int i = 0; i < 5; i++){
            N[i] = sc.nextInt();
            if(N[i] == 0){
                System.out.println(i+1);
            }
        }
    }
}

import java.util.*;
 
public class Main{
  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        double count = 0;
        for(int i = 0; i < N; i++){
            int temp = Integer.parseInt(sc.next());
            if(temp % 4 == 0){
                count += 1.0;
            } else if (temp % 2 == 0){
                count += 0.5;
            }
        }

        if((int)count >= N / 2){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] x = new int[5];
        for(int i = 0; i < 5; i++){
            x[i] = Integer.parseInt(sc.next());
        }
        
        int y;
        int min = 11;
        int last = 0;
        for(int i = 0; i < 5; i++){
            y = x[i] % 10;
            if(y == 0){
                y =10;
            }
            if(y < min){
                last = i;
                min = y;
            }
        }
        
        int time = 0;
        for(int i = 0; i < 5; i++){
            if(i == last){
                time += x[i];
            }else{
                if(x[i] % 10 == 0){
                    time += x[i];
                }else{
                    time += x[i] + (10 - (x[i] % 10));
                }
            }
        }
        
        System.out.println(time);
    }
}
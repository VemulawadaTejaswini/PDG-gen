import java.util.Scanner;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int l = stdIn.nextInt();
        int a = l % 2019;
        int r = stdIn.nextInt();
        int b = r % 2019;
        boolean flag = false;
        
        for(int i = l; i <= r; i++){
            if(i % 2019 == 0){
                flag = true;
                break;
            }
        }
        
        if(a > b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        
        int min = 2018;
        
        if(a == b || flag == true){
            min = 0;
        }else{
            for(int i = a; i <= b - 1; i++){
                for(int j = a + 1; j <= b; j++){
                    if((i * j) % 2019 < min){
                        min = (i * j) % 2019;
                    }
                }
            }
        }
        
        
        System.out.println(min);
    }
}
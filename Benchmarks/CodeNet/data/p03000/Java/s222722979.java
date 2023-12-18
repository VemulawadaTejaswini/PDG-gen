import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int x = stdIn.nextInt();
        int count = 0;
        int position = 0;
        
        if(x != 0){
            count++;
            while(stdIn.hasNext()){
                int a = stdIn.nextInt();
                position += a;
                
                if(position <= x){
                    count++;
                }else{
                    break;
                }
            }
        }
        
        System.out.println(count);
    }
}

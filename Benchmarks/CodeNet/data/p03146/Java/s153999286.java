import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int s = Integer.parseInt(sc.next());
        
        boolean[] x = new boolean[1000000];
        
        int count = 1;
        while(true){
            count++;
            if(s%2 == 0){
                s = s/2;
                if(x[s]){
                    break;
                }
                x[s] = true;
            }else{
                s = s*3+1;
                if(x[s]){
                    break;
                }
                x[s] = true;
            }
        }
        
        System.out.println(count);
    }
}
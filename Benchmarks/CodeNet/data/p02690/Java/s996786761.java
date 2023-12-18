import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 0;
        while(true){
            double chk = Math.pow((double)(x-(int)Math.pow(i,5)),0.2);
            if(chk % 1 == 0){
                System.out.println(i + " " + (long)-chk);
                break;
            }
            i++;
        }
    }
    
}

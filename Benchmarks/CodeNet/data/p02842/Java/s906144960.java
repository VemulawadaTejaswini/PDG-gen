import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        for(int i=0;i<a;i++){
            int b = (int)(i*1.08);
            if(b==a){
                System.out.println(i);
                break;
            }else if(b>a){
                System.out.println(":(");
                break;
            }
        }
    }
}

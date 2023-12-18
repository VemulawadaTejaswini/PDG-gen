import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int ans=(int)Math.round(a/1.08);
        int ans2=(int)(ans*1.08);
        if(a==ans2){
            System.out.println(ans);
        }else{
            System.out.println(":(");
        }
    }
}

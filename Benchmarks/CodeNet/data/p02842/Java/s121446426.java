import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int ans=a*100%108;
        int ans2=a*100/108;
        if(ans==0){
            System.out.println(ans2);
        }else{
            System.out.println(":(");
        }
    }
}

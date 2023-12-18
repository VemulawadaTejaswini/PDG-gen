import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner  yomi = new Scanner(System.in);
        int n = yomi.nextInt();
        int a = 0;
        for(int i = 1;i<=n;i++){
            if (i%3!=0 && i%5!=0){
                a = a+i;
            }
        }
        System.out.println(a);


    }
}
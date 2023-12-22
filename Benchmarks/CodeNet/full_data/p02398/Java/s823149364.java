import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int reg =0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for(int i=a;i<b+1;i++){
            if(c%i==0){
                reg++;
            }
        }
        System.out.println(reg);
    }
}

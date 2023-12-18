import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int s = 0;
        for(int i = 1; i <= n; i++){
            s = s + l + i - 1;
        }
        int a = 0;
        for(int i = 1; i <= n; i++){
            if(l - 1 + i == 0){
                a = i;
            }
        }
        if(a == 0){
            if(l * l > (l + n - 1) * (l + n - 1)){
                a = n;
            }else{
                a = 1;
            }
        }
        System.out.println(s - l + 1 - a);
        sc.close();
    }
}
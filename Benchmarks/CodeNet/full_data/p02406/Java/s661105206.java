import java.util.Scanner;

public class Main{

    public static boolean has3(int x){
        while(x>0){
            if(x%10==3) return true;
            x/=10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i%3==0 || has3(i)){
                System.out.print(" "+i);
            }
        }
        System.out.println("");
    }
}

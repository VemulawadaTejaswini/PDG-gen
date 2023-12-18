import java.util.*;

public class Main {
    public static boolean find_k(int a, int b,int x){
        for(int i=1;i<=a;i++){
            for(int j=1; j<=b;j++){
                int y=i*j+(a-i)*(b-j);
                if(y==x){
                    return true;
                }
                if(y>x){
                    break;
                }

            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int m=r.nextInt();
        int n=r.nextInt();
        int k=r.nextInt();
        if (find_k(m,n,k))
            System.out.println("Yes");
        else
            System.out.println("No");


    }
}

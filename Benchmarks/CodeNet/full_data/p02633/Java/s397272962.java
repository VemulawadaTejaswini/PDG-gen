import java.util.*;
public class Main{
    static int goo(int a,int b) {
        int yuku;
        while((yuku = a % b) != 0){
            a = b;
            b = yuku;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int all = 360;
        int koubaisuu;
        int anc;
        int yu;
        int yukuanc;

        outside:{
        if(all%A == 0){
            anc = all/A;
        }else{
            for(int i = 2;i < A;i++){
                if(A % i == 0){
                    yukuanc = goo(all,A);
                    all *= A;
                    yu = all/yukuanc;
                    anc = yu/A;
                    //System.out.println(anc);
                    break outside;
                }
            }
            all *= A;
            anc = all/A;
        }
        }
        System.out.println(anc);
    }
}
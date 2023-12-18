import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int opt=2019;
        int l_r = L%2019;
        int r_r = R%2019;

        if(L==0||R-L>=2019) opt=0;
        else if(R<2019){
            for(int i=L;i<=R-1;i++){
                for(int j=i+1;j<=R;j++){
                    int num = (i*j)%2019;
                    if(opt>num) opt=num;
                }
            }
        }
        else if(R-L<2019&&l_r-r_r>0) opt=0;
        else opt=l_r*(l_r+1);
        System.out.println(opt);
    }
}

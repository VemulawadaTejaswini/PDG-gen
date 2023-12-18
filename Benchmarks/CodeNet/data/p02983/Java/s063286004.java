import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int opt=0;
        int l_r = L%2019;
        int r_r = R%2019;
        if(L==0||l_r>=r_r) opt=0;
        else if(R<2019) opt= L%2019*(L+1)%2019;
        else if(R-L>=2019) opt=1;
        else if(R-L<2019) opt=L%2019*(L+1)%2019;
        System.out.println(opt);
    }
}
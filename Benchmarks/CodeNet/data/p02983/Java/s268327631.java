import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int opt=2019;


        if(L==0||R-L>=2019) opt=0;
        else{
            for(int i=L;i<R;i++){
                for(int j=i+1;j<=R;j++){
                    int num = (i*j)%2019;
                    if(opt>num) opt=num;
                }
            }
        }
        System.out.println(opt);
    }
}

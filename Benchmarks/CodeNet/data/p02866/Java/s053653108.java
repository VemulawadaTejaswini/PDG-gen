import java.util.*;
public class Main {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] List = new int[N];
        int opt=1;
        int root = 1;
        int max = 0;
        for(int i=0;i<N;i++) {
            int num = sc.nextInt();
            if(i==0) root = num;
            if(max<num) max = num;
            List[num]++;
        }
        if(root==0&&List[0]==1){
            for(int i=1;i<max;i++){
                if(List[i]!=0&&List[i+1]!=0){
                    int num2 = 1;
                    for(int j=0;j<List[i+1];j++)num2= (num2*List[i])%998244353;
                    opt=(opt*num2)%998244353;
                }
                else{
                    opt = 0;
                    break;
                }
            }

        }
        else  opt=0;
        System.out.println(opt);
    }
}
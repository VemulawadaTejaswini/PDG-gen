import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] c = new int[n];
        int[][] a = new int[n][m];
        int[] sum  =new int[m];
        int money=0;
        int min = 999999999;
        int flag =0;
        
        for(int i =0;i<n;i++){
            c[i] = sc.nextInt();
            for(int j = 0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }

        for(int i =0;i<n;i++){
            money=0;
            //System.out.println("num i ="+i);
            for(int j =i;j<n;j++){
                money+=c[j];
               // System.out.println("money: "+money);
                for(int k =0;k<m;k++){
                    sum[k]+=a[j][k];
                    //System.out.println("sum :"+sum[k]);
                }
                for(int l =0;l<m;l++){
                    if(sum[l]>=x){
                        flag++;
                    }
                    //System.out.println(flag);
                }
                if(flag==m){
                    if(min>money){
                        min=money;
                    }
                    break;
                }else{
                    flag=0;
                }
            }
            Arrays.fill(sum,0);
            flag=0;

        }
        if(min==999999999){
            System.out.println(-1);
        }else{
            System.out.println(min);
        }
    }
}





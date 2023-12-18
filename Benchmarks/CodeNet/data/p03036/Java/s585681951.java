import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int flg=0;
        int sum=0;

        for(int i=1;i<=n;i++){
            for(int j=0;j<m;j++){
                if(i>=sc.nextInt()&&i<=sc.nextInt()){
                }else{
                    flg=1;
                    break;
                }
            }
            if(flg==0){
                sum++;
            }else{
                flg=0;
            }
        }
        System.out.println(sum);
    }
}
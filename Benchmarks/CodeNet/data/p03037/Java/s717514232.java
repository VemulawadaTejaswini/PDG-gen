import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int lmax=0;
        int rmin=n;
        for(int i=0;i<m;i++){
           int ninja = sc.nextInt();
           int unk0 = sc.nextInt();
           if(ninja>lmax){
               lmax=ninja;
           }
           if(unk0<rmin){
               rmin=unk0;
           }
        }
        int sum=rmin-lmax+1;
        if(sum<0){
            sum=0;
        }
        System.out.println(sum);
    }
}
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int  num=10001;
        int a[]=new int[num];
        for(int i=2;i<num;i++){
            a[i]=1;
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(a[i]==1){
                for(int j=0;i*(j+2)<num;j++){
                    a[i*(j+2)]=0;
                }
            }
        }
        while(true){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            for(int i=n;i>=5;i--){
                if(a[i]==1&&a[i-2]==1){
                    System.out.println((i-2)+" "+i);
                    break;
                }
            }
        }
    }
}

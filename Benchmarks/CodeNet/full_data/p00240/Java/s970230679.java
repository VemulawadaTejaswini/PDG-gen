import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            double y=sc.nextInt();
            int x=0;
            double max=0;
            for(int i=0;i<n;i++){
                int b=sc.nextInt();
                double r=sc.nextInt();
                int t=sc.nextInt();
                if(t==1){
                    double sum=1+y*(r/100);
                    if(sum>max){
                        max=sum;
                        x=b;
                    }
                }else{
                    double sum=Math.pow(1+(r/100),y);
                    if(sum>max){
                        max=sum;
                        x=b;
                    }
                }
            }
            System.out.println(x);
        }
    }
}

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long[] ar=new long[N];
        int count=0;
        for(int i=0;i<N;i++){
            //System.out.println("Hello");
            long a=sc.nextLong();
            ar[i]=a;
            if(a%2!=0){
                //System.out.println("count="+count);
                count++;
            }
        }
        //System.out.println(count);
        if(count==N){
            System.out.println("0");
        }
        else{
            int count1=0;
            boolean b=true;
            while(b){
                int count2=0;
                //System.out.println("Hello");
                boolean c=true;
                for(int i=0;i<N;i++){
                    //System.out.println("Hello for");
                    if(ar[i]%2==0 && c){
                        //System.out.println("if");
                        ar[i]/=2;
                        if(ar[i]%2!=0){
                            count2++;
                        }
                        c=false;
                    }
                    else{
                        //System.out.println("else");
                        ar[i]*=3;
                        if(ar[i]%2!=0){
                            count2++;
                            //System.out.println("count2="+count2);
                        }
                    }
                    //System.out.print(ar[i]+" ");
                }
                //System.out.println();
                count1++;
                if(count2==N){
                    b=false;
                }
            }
            System.out.println(count1);
        }
    }
}
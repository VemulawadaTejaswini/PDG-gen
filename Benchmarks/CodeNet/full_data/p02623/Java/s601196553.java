import java.util.*;
 public  class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long k=sc.nextLong();
        long a[]=new long[n];
        long b[]=new long[m];
        for(int i=0;i<n;i++)
            a[i]=sc.nextLong();
        for(int i=0;i<m;i++)
            b[i]=sc.nextLong();

        int i=0,j=0;long t=0;
        int c=0;
        while(i<n && j<m && t<=k){

            if(a[i]<=b[j]){
                if(t+a[i]<=k){
                    t+=a[i];
                    i++;
                }else{
                    break;
                }
            }else{
                if((t+b[j])<=k){
                    t+=b[j];
                    j++;
                }
                else{
                    break;
                }
            }
            c++;
        }

        while(i<n && t<=k){
            if(t+a[i]<=k) {
                t += a[i];

                c++;
            }
            i++;
        }

        while(j<m && t<=k){
            if((t+b[j])<=k) {
                t += b[j];

                c++;
            }
            j++;
        }
        System.out.println(c);

    }

}



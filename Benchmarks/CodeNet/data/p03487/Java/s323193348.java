import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main{
    static Scanner scan=new Scanner(System.in);
    public static void main(String args[]){
        int n=scan.nextInt();
        Integer a[]=new Integer[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }

        Arrays.sort(a,Comparator.naturalOrder());
        //for(int i=0;i<n;i++)System.out.print(a[i]+" ");
        //System.out.println();
        int min=n;
        int tmp,cnt=1;
        int sum=0;
        for(int i=0;i+1<n;i++){
            if(a[i]==a[i+1]){
                cnt++;
            }else{ 
                tmp=Math.abs(cnt-a[i]);
                if(tmp<cnt){
                    sum+=tmp;
                }else{
                    sum+=cnt;
                }
                cnt=1;
            }
        }
        tmp=Math.abs(a[n-1]-cnt);
        if(tmp<cnt){
            sum+=tmp;
        }else{
            sum+=cnt;
        }
        //System.out.println(sum);
        if(n>sum)System.out.println(sum);
        else System.out.println(n);
    }
}
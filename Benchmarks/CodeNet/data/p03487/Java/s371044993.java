import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main{
    static Scanner scan=new Scanner(System.in);
    public static void main(String args[]){
        int n=scan.nextInt();
        int a[]=new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        Arrays.sort(a);

        int tmp,cnt=1;
        int sum=0;
        for(int i=0;i+1<n;i++){
            if(a[i]==a[i+1]){
                cnt++;
            }else{ 
                tmp=cnt-a[i];
                sum+=tmp<0?cnt:tmp;
                cnt=1;
            }
        }
        tmp=cnt-a[n-1];
        sum+=tmp<0?cnt:tmp;
        //System.out.println(sum);
        System.out.println(sum);
    }
}

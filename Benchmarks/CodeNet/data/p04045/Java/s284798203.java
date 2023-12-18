import java.util.*;

public class Main {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);


        int n=scan.nextInt();
        int k=scan.nextInt();
        int []d=new int[k];
        int tmp;


        for(int i=0;i<k;i++)
            d[i]=scan.nextInt();
        Arrays.sort(d);

        int ans=0;


        tmp=n;
        int a,keta=0;
        while(tmp!=0){
            a=tmp%10;
            for(int i=0;i<k;i++){
                if(a!=d[i])
                    break;
                else
                    a++;
            }
            ans+=a*Math.pow(10,keta);
            tmp/=10;
            keta++;
        }
        System.out.println(ans);

    }
}
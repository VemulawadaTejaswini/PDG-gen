import java.util.Scanner;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer n = Integer.parseInt(scan.next());

        Integer a[] = new Integer[n];
        for(int i=0;i<n;i++)
            a[i] = Integer.parseInt(scan.next());

        Integer b[] = new Integer[n];
        for(int i=n-1;i>=0;i--){
            if((i+1) > n/2){
                //System.out.println("X");
                b[i] = a[i];
            }else{
                //System.out.println("Y");
                int tmp = i+1;
                int sum = 0;
                while(true){
                    //System.out.println("YO");
                    if((tmp += (i+1)) <= n){
                        sum += b[tmp-1];
                        //System.out.println(tmp + "  " + sum);
                    }else{
                        break;
                    }
                }
                //System.out.println(i + "  " + sum);
                if(sum%2==a[i])
                    b[i] = 0;
                else
                    b[i] = 1;
            }
        }
        int cnt=0;
        String str = "";
        for(int i=0;i<n;i++){
            if(b[i]==1){
                str += (i+1) + " ";
                cnt++;
            }
        }
        System.out.println(cnt);
        if(cnt != 0)
            System.out.println(str);
    }
}
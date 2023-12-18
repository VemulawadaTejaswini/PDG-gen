import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        int s[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            s[i]=scan.nextInt();
            sum+=s[i];
        }

        Arrays.sort(s);
        int ind=0;
        while(true){
            if(sum%10!=0){
                break;
            }
            if(s[ind]%10!=10){
            sum-=s[ind];
            }
            ind++;
            if(ind>=s.length || sum<0)
                break;
        }
        if(ind==s.length)
            sum=0;

        System.out.println(sum);
    }
}

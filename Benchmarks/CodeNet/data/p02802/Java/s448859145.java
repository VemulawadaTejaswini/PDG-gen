import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int wacount=0;
        int account=0;
        boolean[] accepted=new boolean[n];
        int tmpnum;
        boolean ac;
        for(int i=0;i<m;i++){
            tmpnum=sc.nextInt()-1;
            ac=sc.next().equals("AC");
            if(!ac){
                if(!accepted[tmpnum]){
                    wacount++;
                }
            }else{
                if(!accepted[tmpnum])account++;
                accepted[tmpnum]=true;
            }
        }
        System.out.println(account+" "+wacount);
 
    }


}
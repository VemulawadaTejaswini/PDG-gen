import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String s=scan.next();
        StringBuilder stg=new StringBuilder();
        stg.append(s);
        int cnt=0;
        int idx;

        while(true){

            idx=stg.indexOf("ST");
           // System.out.println(stg+" "+idx);
            if(idx==-1)
                break;
            stg.delete(idx,idx+2);
            cnt++;
        }
        System.out.println(s.length()-cnt*2);

    }
}

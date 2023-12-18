import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s_len = sc.nextInt();
        int n = sc.nextInt();
        String s = sc.next();

        for(int i=0;i<n;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            String str = s.substring(l-1,r);
            String ac = "AC";
            int result=0;
            int count=0;
            while(result!=-1){
                result = str.indexOf(ac);
                //System.out.println(result);
                if(result!=-1){
                    count+=1;
                    str = str.substring(result+2);
                }
            }
            System.out.println(count);
        }
    }
}

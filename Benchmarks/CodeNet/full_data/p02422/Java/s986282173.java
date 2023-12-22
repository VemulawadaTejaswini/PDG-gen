import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        StringBuilder str=new StringBuilder();
        str.append(scan.nextLine());
        int q=scan.nextInt();
        for(int i=0;i<q;i++){
            String in =scan.next();
            int a=scan.nextInt();
            int b=scan.nextInt();

            if(in.equals("print")){
                System.out.println(str.substring(a,b+1));
            }
            if(in.equals("replace")){
                String p=scan.next();
                str.replace(a,b+1,p);
            }
            if(in.equals("reverse")){
                StringBuilder rev =new StringBuilder();
                rev.append(str.substring(a,b+1));
                rev.reverse();
                str.replace(a,b+1,rev.toString());
            }
        }
    }
}


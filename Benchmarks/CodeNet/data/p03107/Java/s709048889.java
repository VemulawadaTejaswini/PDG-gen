import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S  = sc.next();
        StringBuilder sb = new StringBuilder(S);

        int count =0;
        while ( true ) {
            int idx1 = sb.indexOf("01");
            int idx2 = sb.indexOf("10");
           if(idx1!=-1){
                sb.delete(idx1,idx1+2);
                count+=2;
            }else if(idx2!=-1){
                sb.delete(idx2,idx2+2);
                count+=2;
            }else{
                break;
            }
        }
        System.out.println(count);


    }
}

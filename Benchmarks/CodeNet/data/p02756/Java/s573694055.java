
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        int q=scanner.nextInt();
        StringBuilder stringBuilder=new StringBuilder(str);

        for(int j=0;j<q;j++){
            int t=scanner.nextInt();
            if(t==1){
                stringBuilder=stringBuilder.reverse();
            }
            else{
                int f=scanner.nextInt();
                if(f==1){
                    char ss=scanner.next().charAt(0);
                    String strr=ss+String.valueOf(stringBuilder);
                    stringBuilder=new StringBuilder(strr);
                }
                else{
                    char ss=scanner.next().charAt(0);
                    stringBuilder.append(ss);
                }
            }
        }
        System.out.println(stringBuilder.toString());
    }
}

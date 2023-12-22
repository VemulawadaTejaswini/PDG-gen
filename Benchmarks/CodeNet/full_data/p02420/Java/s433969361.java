import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] h = new int[100];
        String str, substr1, substr2;
        while(true){
            int m=0;
            str = sc.next();
            if(str.charAt(0) == '-') break;
            m = sc.nextInt();
            for(int i=0;i<m;i++){
                h[i] = sc.nextInt();
            }
            for(int i=0;i<m;i++){
                substr1 = str.substring(0,h[i]);
                substr2 = str.substring(h[i]);
                str = substr2 + substr1;
            }
            System.out.println(str);
        }
    }
}

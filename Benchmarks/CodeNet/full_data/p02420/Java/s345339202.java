import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(true){
            String str=scan.next();
            if(str.equals("-")) break;
            int m=scan.nextInt();
            int[] h=new int[m];
            for(int i=0;i<m;i++){
                h[i]=scan.nextInt();
                str=str.substring(h[i],str.length())+str.substring(0,h[i]);
            }
            System.out.println(str);
        }
    }
}

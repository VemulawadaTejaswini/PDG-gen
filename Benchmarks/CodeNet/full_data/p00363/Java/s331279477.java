import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w=sc.nextInt()-1,h=sc.nextInt()-1;
        String c=sc.next();
        for(int i=0;i<=h;i++) {
            String s="";
            for(int j=0;j<=w;j++) {
                if(i==(h+1)/2&&j==(w+1)/2) {
                    s+=c;
                }else if((i|j)==0||i==0&&j==w||i==h&&j==0||i==h&&j==w) {
                s+="+";
                }else if(i==0||i==h) {
                   s+="-";
                }else if(j==0||j==w) {
                    s+="|";
                }else {
                    s+=".";
                }
            }
            System.out.println(s);
        }
    }
}

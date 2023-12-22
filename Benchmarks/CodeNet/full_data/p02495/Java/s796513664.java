import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int H,W,i,j;
        char a='#',b='.',c;
        Scanner sc = new Scanner(System.in);

        for(;;){
            H = sc.nextInt();
            W = sc.nextInt();
            if(H == 0 && W == 0)break;
if(H<1 || W>300)break;
            for(j=0;j<H;j++){
                for(i=0;i<W;i++){
                    System.out.printf("%s",a);
                    i++;
                    if(i == W) break;
                    for(;;){
                        System.out.printf("%s",b);
                        break;
		    }
                }
                System.out.println("");
                c=a;
                a=b;
                b=c;
            }
            System.out.println("");
        }
    }
}
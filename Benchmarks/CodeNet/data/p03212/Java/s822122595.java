import java.util.Scanner;
public class Main {
    public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
        int M=0;
        for(int i=1;i<=N;i+=2){
            int a=0;
            int b=0;
            int c=0;
            int d=0;
            for(int j=i;j>0;j/=10){
                if(j%10==3){
                    a++;
                }else if(j%10==5){
                    b++;
                }else if(j%10==7){
                    c++;
                }else{
                    d++;
                    break;
                }
            }
            if(a!=0&&b!=0&&c!=0&&d==0){
                M++;
            }
        }
        System.out.println(M);
    }
}
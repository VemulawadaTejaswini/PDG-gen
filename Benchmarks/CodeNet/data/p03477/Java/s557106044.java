import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int condition = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N[];
        int tmp=0;
        N =new int[condition];
        for(int j=0;condition>j;j++){
            N[j]=j+1;
        }
        for(int i=0;condition>i;i++){
            if(A<=N[i]%10+N[i]%100/10+N[i]%1000/100+N[i]%10000/1000+N[i]/10000&&
                    N[i]%10+N[i]%100/10+N[i]%1000/100+N[i]%10000/1000+N[i]/10000<=B){
                tmp+=N[i];
            }
        }
        System.out.println(tmp);
    }
}
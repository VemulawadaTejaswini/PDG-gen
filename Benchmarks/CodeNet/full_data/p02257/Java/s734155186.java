import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num,cnt=0,j;
        for(int i=0;i<n;i++){
            num=sc.nextInt();
            j=2;
            while(j<=Math.sqrt(num)){
                if(num%j==0){
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}

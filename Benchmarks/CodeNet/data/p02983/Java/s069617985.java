import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int L =scn.nextInt();
        int R =scn.nextInt(); 
        R=Math.min(R,L+4038);
        int answer = 2018;
        for(int i=L;i<=R;i++){
            for(int j=i+1;j<=R;j++){
                int x = i*j%2019;
                answer=Math.min(answer,x);
            }
        }
        System.out.println(answer);
    }
}

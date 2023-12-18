import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //1 ~ 10^5
        int N = sc.nextInt();

        if (N==1){System.out.println(0);}
        else{
            int Ans = 0;
            int Temp = 0;
            int[] H = new int[N];
            for(int i=0;i<N;i++){H[i]=sc.nextInt();}
            for(int i=0;i<N-1;i++){
                if(H[i]>=H[i+1]){Temp += 1;}
                if((H[i]<H[i+1])|(i == N-2)){
                    if(Ans < Temp){Ans = Temp;}
                    Temp = 0;
                }
            }
            System.out.println(Ans);
            
        }
        sc.close();
    }
}
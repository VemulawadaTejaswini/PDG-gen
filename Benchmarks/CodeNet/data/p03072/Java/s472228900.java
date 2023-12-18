import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] Ni;
        Ni = new int[100];
        
        int cnt2=1;
        for(int i=0;i<N;i++){
            Ni[i] = sc.nextInt();
        }
        int max =Ni[0];
        for(int l=1;l<N;l++){
            if(max<=Ni[l]){
                cnt2 += 1;
            }else{
                continue;
            }
        }
        if(max<=Ni[N-1]&&Ni[N-1]<Ni[N-2]){
            cnt2 -=1;
        }
        System.out.println(cnt2);
    }
}
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int bit[] = new int[N];
        for(int i=0;i<N-1;++i){
            int x = scan.nextInt();
            int y = scan.nextInt();
            int a = scan.nextInt();
            bit[x]^=a;
            bit[y]^=a;
        }
        int count[] = new int[1<<4];
        for(int i=0;i<N;++i)count[bit[i]]++;
        int ans =0;
        for(int i=1;i<(1<<4);++i){
            ans+=count[i]/2;
            count[i]%=2;
        }
        int num=0;
        for(int i=1;i<(1<<4);++i){
            if(count[i]>0){
                num^=i;
                count[i]--;
                if(num==i)continue;
                ++ans;
                if(count[num]>0){
                    ++ans;
                    num=0;
                    count[num]--;
                }
            }
        }
        System.out.println(ans);
    }
}
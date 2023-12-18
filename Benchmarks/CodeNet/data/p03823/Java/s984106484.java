import java.util.Arrays;
import java.util.Scanner;

class BIT{
    int N;
    long[] data;
    long inf = 1000000007;
    
    public BIT(int n){
        N = n;
        data = new long[N+1];
        Arrays.fill(data,0);
    }

    public void add(int pos,long dat){
        for(int x = pos;x<=N; x += x&-x){
            data[x] = (data[x]+dat)%inf;
        }
    }

    public long getSum(int pos){
        if(pos==0)return 0;
        long res = 0;
        for(int x = pos; x>0;x-=x&-x)res=(res+data[x])%inf;
        return res;
    }

    public long getSum(int left, int right){
        return (getSum(right) - getSum(left) + inf)%inf;
    }

    public void setData(int pos, long dat){
        long befdat = getSum(pos-1, pos);
        add(pos, dat-befdat);
    }

    public void setZero(int pos){
        long dat = data[pos];
        for(int x=pos;x<=N; x+= x&-x)data[x] =(data[x]- dat +inf)%inf;
        for(int x=pos;x>0;x -= x&-x)data[x] = 0;
    }
}



class Main{

    static int N;
    private static int getIndex(long[] S, long B, int i){
        int left =2;
        int right=N+3;
        while(true){
            int center = (left+right)/2;
            if(S[i] - S[center] >=B){
                left = center;
            }else{
                right = center;
            }
            if(right-left == 1)break;
        }
        return left;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        long A = scan.nextLong();
        long B = scan.nextLong();
        long[] S = new long[N+3];
        S[2] = Long.MIN_VALUE/2;
        for(int i=0;i<N;++i)S[i+3] = scan.nextLong();


        if(A>B){
            long a = A;
            A=B;
            B=a;
        }
        for(int i=3;i<=N;++i){
            if(S[i+2]-S[i] < A){
                System.out.println(0);
                return;
            }
        }

        BIT bit = new BIT(N+3);

//        bit.setData(1, 1);
        bit.setData(2,1);

        for(int i=3;i<N+3;++i){
            //Y:
            bit.setData(i, bit.getSum(getIndex(S, B, i)));
//            System.out.println(getIndex(S, B, i));
            //X:
            if(S[i]-S[i-1] < A){
                bit.setZero(i-2);
            }
            // for(int j=1;j<N+3;++j)System.out.print(bit.getSum(j-1, j) + " ");
            // System.out.println();
        }
        System.out.println(bit.getSum(N+2));
    }
}
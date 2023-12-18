import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        int digit =0;//2進数表示したときの桁数
        long tmp = b;
        while(tmp > 0){
            digit++;
            tmp/=2;
        }
        long res = 0;
        for(int i=digit;i>=1;i--){
            long l = 1L << i;
            long amod = a%l;
            long bmod = b%l;
            long count;
            if(bmod > amod){
                count = Math.max(bmod - l/2 +1 ,0) - Math.max(amod - l/2 ,0);
            }else{
                count = l/2 - Math.max(amod -l/2,0) + Math.max(bmod-l/2+1, 0);
            }
            if(l==2){
                long mod = (b-a+1)%4;
                if(a%2==0){
                    if(mod <=1 ){
                        count = 0;
                    }else {
                        count = 1;
                    }
                }else{
                    if(mod==1 || mod == 2){
                        count = 1;
                    }else {
                        count = 0;
                    }
                }
            }

            if(count%2==0){
                res*=2;
            }else {
                res = res*2 + 1;
            }

        }
        System.out.println(res);
        sc.close();
    }
}
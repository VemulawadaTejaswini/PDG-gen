import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        long tmp = 2018;

        if(r-l >= 2019){
            tmp = 0;
        }else{
            for(long i = l;i < r;++i){
                for(long j = i+1;j <= r;++j){
                    tmp = Math.min(tmp,(i*j)%2019);
                }
            }
            
        }
        System.out.println(tmp);
        }
    }

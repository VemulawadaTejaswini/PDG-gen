
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    static int N;
    static Vec3[] vec3s;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N=scanner.nextInt();
        final int M=scanner.nextInt();
        vec3s=new Vec3[N];
        for(int i=0;i<N;i++){
            vec3s[i]=new Vec3(scanner.nextLong(),scanner.nextLong(), scanner.nextLong());
        }
        long[] result =new long[8];
        for(int i=0;i<8;i++){
            result[i]=func(M,N,i);
        }
        long max=Long.MIN_VALUE;
        for(int i=0;i<8;i++){
            if(max<result[i])max=result[i];
        }
        System.out.println(max);

    }
    public static long func(int takeNum,int index,int bit){
        if(index==0){
            return 0;
        }
        if(takeNum==0){
            return func(takeNum,index-1,bit);
        }
        boolean[] booleans=new boolean[3];
        for(int k=2;k>=0;k--){
            if(bit/Math.pow(2,k)%2==0){
                booleans[k]=true;
            }else{
                booleans[k]=false;
            }
        }
        long res=0;
        for(int i=0;i<3;i++){
            if(booleans[i]){
                res+=vec3s[index-1].get(i);
            }else{
                res-=vec3s[index-1].get(i);
            }
        }
        return Math.max(func(takeNum-1,index-1,bit)+res,
                func(takeNum,index-1,bit));
    }
    public static class Vec3{
        long x;
        long y;
        long z;
        Vec3(long x,long y,long z){
            this.x=x;
            this.y=y;
            this.z=z;
        }
        long get(int i){
            if(i==1){
                return x;
            }else if(i==2){
                return y;
            }else{
                return z;
            }
        }
        double len(){
            return Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
        }
    }
}
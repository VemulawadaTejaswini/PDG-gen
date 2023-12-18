
import java.util.Scanner;
import java.util.ArrayList;

class Main{
        private static long sub;

        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                long n=scanner.nextLong();
                long k=scanner.nextLong();
                ArrayList<Long> a=new ArrayList<>();
                for(int i=0;i<n;i++){
                        a.add(scanner.nextLong());
                }

                long m=0;
                for(int i=0;i<n;i++){
                        if(a.get(i)>m){
                                m=a.get(i);
                        }
                }

                long div=getGCD(a);
                if(k%div==0 && k<=m){
                        System.out.println("POSSIBLE");
                }else{
                        System.out.println("IMPOSSIBLE");
                }
        }

        private static long getGCD(ArrayList<Long> a){
                long j=getGCD(a.get(0),a.get(1));
                for(int i=2;i<a.size();i++){
                        j=getGCD(j,a.get(i));
                }
                return j;
        }

        private static long getGCD(long i,long j){
                long tmp=0;
                if(i<j){
                        tmp=i;
                        i=j;
                        j=tmp;
                }
                if(j==0){
                        return i;
                }else{
                        return getGCD(j,i%j);
                }
        }
}
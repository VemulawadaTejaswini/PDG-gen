
import java.util.Scanner;
import java.util.ArrayList;

class Main{
        private static int sub;

        public static void main(String[] args){
                Scanner scanner=new Scanner(System.in);
                int n=scanner.nextInt();
                int k=scanner.nextInt();
                ArrayList<Integer> a=new ArrayList<>();
                for(int i=0;i<n;i++){
                        a.add(scanner.nextInt());
                }

                int m=0;
                for(int i=0;i<n;i++){
                        if(a.get(i)>m){
                                m=a.get(i);
                        }
                }

                int div=getGCD(a);
                if(k%div==0 && k<=m){
                        System.out.println("POSSIBLE");
                }else{
                        System.out.println("IMPOSSIBLE");
                }
        }

        private static int getGCD(ArrayList<Integer> a){
                int j=getGCD(a.get(0),a.get(1));
                for(int i=2;i<a.size();i++){
                        j=getGCD(j,a.get(i));
                }
                return j;
        }

        private static int getGCD(int i,int j){
                int tmp=0;
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
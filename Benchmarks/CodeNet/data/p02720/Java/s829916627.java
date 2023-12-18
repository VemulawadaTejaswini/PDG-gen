import java.util.Scanner;
import java.util.LinkedList;
import java.lang.Math;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        sc.close();
        LinkedList<Long> list = new LinkedList<Long>();//[1]
        for(long i=1;i<10;i++){
            list.add(i);
        }

        long ans=0;

        for(long i=0;i<k;i++){
            ans = list.get(0);
            list.remove(0);
            if(ans%10 != 0){
                list.add(11*ans-1);
            }
            list.add(11*ans);
            if(ans%10 != 9){
                list.add(11*ans+1);
            }
        }
        System.out.println(ans);
    }
        
    public static int[] sort(int[] a){
        int x;
        for(int i=0;i<a.length;i++){
            x = a[i];
            for(int j=0;j<a.length;j++){
                if(x == Math.max(x,a[j])){
                    a[i]=a[j];
                    a[j]=x;
                    x=a[i];
                }
            }
        }
        return a;
    }
}
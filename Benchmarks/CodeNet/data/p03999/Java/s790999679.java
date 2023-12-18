import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        String S;

        try (Scanner sc = new Scanner(System.in)) {
            S = sc.next();
        }
        char[] c = S.toCharArray();
        int[] index = new int[c.length];
        for(int i=0;i < c.length;i++){
            index[i] = Integer.valueOf(S.substring(i, i+1));
        }

        long result = 0;

        for(int i = 0;i < index.length;i++){
            //i番目の文字について
            //1桁目→MAXのまで
            long sum = 0;
            int kMax = index.length - (i+1) +1;
            int p =1;
            for(int k=1; k <= kMax;k++){
                int aNum = i;
                int bNum = index.length - (i) -(k);

                long a ;
                long b;

                if(aNum ==0){
                    a = 1;
                }else{
                    a = (long) (Math.pow(2, aNum));
                }
                if(bNum ==0){
                    b = 1;
                }else{
                    b = (long) (Math.pow(2, bNum-1));
                }

                sum += a * b * p * index[i];
                //debug("index[i],a,b,p:"+index[i]+","+a+","+b+","+p);
                p *=10;
            }
            result += sum;
        }
        System.out.println(result);
    }

}

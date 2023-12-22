import java.util.*;

class Main{
    public Main(){
        Scanner SC = new Scanner(System.in);

        String S = SC.next();
        int L = S.length();
        int[] N = new int[L];
        for(int i=0;i<L;i++){
            N[i] = S.charAt(i) - '0';
        }

        int total = 0;
        int left = 0;
        while(left+3 < L){
            int mod = (N[left]*1000 + N[left+1]*100 + N[left+2]*10 + N[left+3]) % 2019;
            if(mod == 0) total++;
            int i = left+4;
            while(i != L){
                mod = (mod*10 + N[i])%2019;
                if(mod == 0) total++;
                i++;
            }
            left++;
        }
        System.out.println(total);
    }

    public static void main(String args[]){
        Main main = new Main();
    }
}

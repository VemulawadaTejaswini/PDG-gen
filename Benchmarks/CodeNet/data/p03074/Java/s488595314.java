import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S=  sc.next();

        List<Integer> list = new ArrayList<>();
        List<Character> list01 = new ArrayList<>();
        char prev = S.charAt(0);
        int count =1;
        for (int i = 1; i < S.length(); i++) {
            char c = S.charAt(i);
            if(prev==c){
                count++;
            }else{
                list.add(count);
                list01.add(prev);
                count=1;
            }
            prev=c;
        }
        list.add(count);
        list01.add(prev);

        if(list01.get(0)=='0'){
            list.add(0,0);
        }
        if(list01.get(list01.size()-1)=='0'){
            list.add(0);
        }
        int ans=0;
        int width = 2*K+1;

        //TLE  n^2
//        for (int i = 0; i < list.size() ; i=i+2) {
//            int len = 0;
//            for (int j = i; j <= Math.min( width+i-1,list.size()-1) ; j++) {
//                len += list.get(j);
//            }
//            ans = Math.max(ans,len);
//        }

        //尺取り
        int left =0;
        int right =0;
        int temp = 0;
        for (int i = 0; i < list.size() ; i=i+2) {
            int nextleft = i;
            int nextright = Math.min(i+width-1,list.size()-1) ;
            while(left<nextleft){
                temp -= list.get(left);
                left++;
            }
            while(right<=nextright){
                temp += list.get(right);
                right++;
            }
            ans = Math.max(ans,temp);
        }

        System.out.println(ans);
    }
}

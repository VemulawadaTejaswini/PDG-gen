import java.util.ArrayList;
import java.util.Scanner;


public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        char[] ch = sc.next().toCharArray();
        ArrayList<Integer> ll = new ArrayList<Integer>();
        char prev = ch[0];
        int cnt = 1;
        for(int i=1;i<n-1;i++){
            if(prev==ch[i]){
                cnt++;
            }else{
                ll.add(cnt);
                cnt = 1;
                prev = ch[i];
            }
        }
        if(prev==ch[n-1]){
            cnt++;
            ll.add(cnt);
        }else{
            ll.add(cnt);
            ll.add(1);
        }
        long sum = 0;
        if((2*k+1)<ll.size()){
            for(int i=0;i<2*k+1;i++){
                sum += ll.get(i);
            }
            sum--;
            for(int i=2*k+1;i<ll.size();i++){
                sum += ll.get(i)-1;
            }
            System.out.println(sum);
        }else{
            System.out.println(n-1);
        }
    }
}
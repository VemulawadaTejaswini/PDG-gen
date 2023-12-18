import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> fir = new ArrayList<Integer>();
        ArrayList<Integer> sec = new ArrayList<Integer>();
        String[] input1 = sc.nextLine().split(" ");
        String[] input2 = sc.nextLine().split(" ");
        int ans = 0;
        for(int i=0 ; i<n ; i++){
            fir.add(Integer.parseInt(input1[i]));
            sec.add(Integer.parseInt(input2[i]));
        }
        fir.add(0);
        sec.add(0);
        //System.out.println(fir + " " + sec);
        for(int i = 0 ; i < n ; i++){
            int count = get(n ,i ,fir , sec );
            if(ans <= count){
                ans = count;
            }
        }
        System.out.println(ans);
    }

    static int get(int n,int sign , ArrayList<Integer> a , ArrayList<Integer> b){
        int sum = 0;
        for(int i = 0;i <= sign; i++){
            sum += a.get(i);
        }
        for(int i = sign; i < n; i++){
            sum += b.get(i);
        }
        return sum;
    }
}

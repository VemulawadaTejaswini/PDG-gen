import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<Integer>[] list = new ArrayList[3];
        for(int i=0;i<3;i++){
            list[i] = new ArrayList<Integer>();
            list[i].add(-1);
            list[i].add((int)Math.pow(10,9)*2);
            for(int j=0;j<n;j++){
                list[i].add(Integer.parseInt(sc.next()));
            }
            Collections.sort(list[i]);
        }
        int ans = 0;
        for(int i=1;i<=n;i++){
            int ij = minIdx(list[1], list[0].get(i));
            for(int j=ij;j<=n;j++){
                int numm = list[1].get(j);
                int jk = minIdx(list[2], list[1].get(j));
                ans += n-jk+1;
            }
        }
        System.out.println(ans);
    }
    
    
    public static int minIdx(ArrayList<Integer> list, int n){
        int min=0;
        int max = list.size();
        int ave=0, num;
        while(min<max){
            ave =(min+max)/2;
            num = list.get(ave);
            if(num<=n){
                min = ave+1;
            }else{
                max = ave;
            }
        }
        return max;
    }
}

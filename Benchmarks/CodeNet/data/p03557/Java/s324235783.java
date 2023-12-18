import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<Integer>[] list = new ArrayList[3];
        for(int i=0;i<3;i++){
            list[i] = new ArrayList<Integer>();
            for(int j=0;j<n;j++){
                list[i].add(Integer.parseInt(sc.next()));
            }
            Collections.sort(list[i]);
        }
        long ans = 0;
        for(int i=0;i<n;i++){
            int c = list[1].get(i);
            ans += (n-minIdx(list[2], c))*(maxIdx(list[0], c));
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
    public static int maxIdx(ArrayList<Integer> list, int n){
        int min=0;
        int max = list.size();
        int ave=0, num;
        while(min<max){
            ave =(min+max)/2;
            num = list.get(ave);
            if(num<n){
                min = ave+1;
            }else{
                max = ave;
            }
        }
        return max;
    }
}

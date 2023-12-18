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
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(); 
        HashMap<Integer,Integer> map2 = new HashMap<Integer,Integer>(); 
        for(int i=1;i<=n;i++){
            int inum = list[0].get(i);
            if(map2.containsKey(inum)){
                ans += map2.get(inum);
            }else{
                int sum = 0;
                int ij = minIdx(list[1], inum);
                for(int j=ij;j<=n;j++){
                    int jnum = list[1].get(j);
                    if(!map.containsKey(jnum)){
                        int numm = list[1].get(j);
                        int jk = minIdx(list[2], jnum);
                        map.put(jnum, n-jk+1);
                    }
                    sum += map.get(jnum);
                }
                map2.put(inum, sum);
                ans += sum;
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

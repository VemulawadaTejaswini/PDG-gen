import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt()-1;
        }
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int loophead = -1;
        list.add(0);
        set.add(0);
        int cur = 0;
        for(int i = 1; i < n+1; i++){
            cur = a[cur];
            if(set.contains(cur)){
                loophead = cur;
                break;
            }
            list.add(cur);
            set.add(cur);
        }
        if(loophead== -1){System.out.println(list.get(list.size()-1));}
        int loopheadindex = list.indexOf(loophead);
        int looplength = list.size()-loopheadindex;
        int ansindex = (int)((k - loopheadindex)%looplength);
        System.out.println(list.get(ansindex + loopheadindex) + 1);
    }
}
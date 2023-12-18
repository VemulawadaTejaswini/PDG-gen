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
        int loophead = 0;
        boolean flag = false;
        list.add(0);
        int cur = a[0];
        for(int i = 1; i < n+1; i++){
            if(list.contains(cur)){
                loophead = cur;
                flag = true;
                break;
            }else{
                list.add(cur);
                cur = a[cur];
            }
        }
        if(!flag){System.out.println(cur);return;}
        int loopheadindex = list.indexOf(loophead);
        int looplength = list.size()-loopheadindex;
        /*
        System.out.println("list size " + list.size());
        System.out.println("head loop index " + loopheadindex);
        System.out.println("head loop length " + looplength);
        */
        long ansindex = (k - Long.valueOf(loopheadindex))%Long.valueOf(looplength);
        System.out.println(list.get((int)ansindex + loopheadindex) + 1);
    }
}


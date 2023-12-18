import java.util.*;
class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<Integer> a = new HashSet<>();
        for(int i=0;i<N;i++){
            a.add(sc.nextInt());
        }
        Set<Integer> b = a;
        String result = "No";
        Iterator<Integer> it = a.iterator();
        Integer mid = it.next();
        Integer right = it.next();
        b.remove(right);
        if(b.contains(mid^right)){
            mid = mid^right;
            b.remove(mid);
        }
        else{
            System.out.println(result);
            return;
        }
        int count = 0;
        while(!b.isEmpty()){
            int presize = b.size();
            for(Integer e : b){
                if(right == (e^mid)){
                    b.remove(e);
                    mid = right;
                    right = e;
                    break;
                }
            }
            if(presize == b.size()){
                break;
            }
            count++;
            if(count>N)break;
        }
        if(b.isEmpty())result="Yes";
        System.out.println(result);
    }
}
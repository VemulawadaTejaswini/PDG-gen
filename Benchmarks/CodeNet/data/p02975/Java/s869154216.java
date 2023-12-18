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
        Integer mid = 0;
        Integer right = a.iterator().next();
        for(Integer e2 : b){
            if(b.contains(right^e2)){
                mid = right^e2;
                b.remove(mid);
                b.remove(right);
                break;
            }
        }
        int count = 0;
        while(!b.isEmpty()){
            int count2 = 0;
            for(Integer e : b){
                count2++;
                if(right == (e^mid)){
                    b.remove(e);
                    mid = right;
                    right = e;
                    break;
                }
            }
            if(count2>b.size()){
                break;
            }
            count++;
            if(count>N+10)break;
        }
        if(b.isEmpty())result="Yes";
        System.out.println(result);
    }
}
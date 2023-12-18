import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Long,Long> map = new TreeMap<>();
        long ans  = 0;

        for(int i = 0;i < n;i++){
            long cost = sc.nextLong();
            long num = sc.nextLong();
            if(map.containsKey(cost)){
                map.put(cost,map.get(cost)+num);
            }else{
                map.put(cost,num);
            }
        }
        for(long i:map.keySet()) {
			if(m<=map.get(i)) {
				ans+=i*m;
				break;
			}else {
				m-=map.get(i);
				ans+=i*map.get(i);
			}
		}
        System.out.println(ans);
    }
}

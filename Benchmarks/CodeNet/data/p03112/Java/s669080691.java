import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int q = sc.nextInt();

        List<Long> aArr = new ArrayList<>();
        List<Long> bArr = new ArrayList<>();
        List<Long> qArr = new ArrayList<>();

        for(int i = 0; i < a;i++){
           aArr.add(sc.nextLong());
        }
        for(int i = 0; i < b;i++){
            bArr.add(sc.nextLong());
        }
        for(int i = 0; i < q;i++){
            qArr.add(sc.nextLong());
        }
        Collections.sort(aArr);
        Collections.sort(bArr);

        List<Building> list = new ArrayList<>();
        int start = 0;
        for(int i = 0;i < a;i++){
            long dis = Long.MAX_VALUE;
            for(int j = start;j < b;j++){
                if(dis - Math.abs(aArr.get(i) - bArr.get(j)) > 0){
                    dis = Math.abs(aArr.get(i) - bArr.get(j));
                } else {
                    start = j-1;
                    break;
                }
            }
            list.add(new Building(aArr.get(i), dis));
        }
        start = 0;
        for(int i = 0;i < b;i++){
            long dis = Long.MAX_VALUE;
            for(int j = start;j < a;j++){
                if(dis - Math.abs(bArr.get(i) - aArr.get(j)) > 0){
                    dis = Math.abs(bArr.get(i) - aArr.get(j));
                } else {
                    start = j-1;
                    break;
                }
            }
            list.add(new Building(bArr.get(i), dis));
        }

        Collections.sort(list);
        long c = list.get((a+b)/2).getD();

        for(int i = 0;i < q;i++){
            long ans = Long.MAX_VALUE;
            start = qArr.get(i) < c ? 0 : (a+b)/2 - 1;
            for(int j = start;j < a+b;j++){
                if(ans < (Math.abs(qArr.get(i) - list.get(j).getD())+list.get(j).getN())){
                    break;
                } else {
                    ans = Math.abs(qArr.get(i) - list.get(j).getD())+list.get(j).getN();
                }
            }
            System.out.println(ans);
        }
    }

    public static class Building implements Comparable{
        long d;
        long n;

        public Building(long d, long n){
            this.d = d;
            this.n = n;
        }

        public long getD() {
            return d;
        }

        public long getN() {
            return n;
        }

        @Override
        public int compareTo(Object o) {
            Building b = (Building)o;
            if(b.getD() == this.d){
                return 0;
            } else if(b.getD() > this.d){
                return -1;
            }
            return 1;
        }
    }
}
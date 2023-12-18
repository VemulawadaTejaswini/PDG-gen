import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if(k<=9){
            System.out.println(k);
            return;
        }

        Queue<Long> q = new PriorityQueue<>();
        for(long i=1;i<10;i++){
            q.add(i);
        }
        int count = 9;
        long now = 0;
        while(true){
            long tmp = q.poll();
            long r1 = rank1(tmp);

            if(tmp%10!=0){
                now = tmp*10+r1-1;
                q.add(now);
                count++;
                if(count==k)break;
            }

            now = tmp*10+r1;
            q.add(now);
            count++;
            if(count==k)break;

            if(tmp%10!=9){
                now = tmp*10+r1+1;
                q.add(now);
                count++;
                if(count==k)break;
            }
        }
        System.out.println(now);

    }

    public static int rank1(long a) {
        String[] tmp = String.valueOf(a).split("");
        return Integer.parseInt(tmp[tmp.length-1]);
    }
}

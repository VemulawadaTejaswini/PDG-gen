import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        LinkedList<Long> list = new LinkedList<>();
        
        for (int i = 1; i < 10; i++) {
            recLun(1,(long)i, list);
        }
        long[] lunlun = list.stream().mapToLong(i->i).toArray();
        Arrays.sort(lunlun);
        System.out.println(lunlun[N-1]);
        

    }

    public static void recLun(int d, long num, LinkedList<Long> list){
        if(d == 11){
            return;
        }
        list.add(num);
        int b =(int)( num%10-1);
        for (int i = 0; i < 3; i++) {
            if(i+b >= 0 && i+b <= 9){
                recLun(d+1, num*10+b+i, list);
            }
        }
    }
}
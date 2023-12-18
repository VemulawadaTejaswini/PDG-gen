import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

//        int[] prices = new int[n];
//        for(int i=0;i<n;i++){
//            prices[i] = sc.nextInt();
//        }

        PriorityQueue<Integer> que = new PriorityQueue<>(new MyComparator());
        for(int i=0;i<n;i++){
            que.add(sc.nextInt());
        }

//        for(int i=0;i<n;i++){
//            System.out.println(
//              que.poll());
//        }

        if(n==1){
            int temp=que.poll();
            for(int i=0;i<m;i++){
                temp = temp/2;
            }
            System.out.println(temp);
            return;
        }


        for(int i=0;i<m;i++){
            //System.out.println(i);
            int a = que.poll();
            int b = que.poll();

            //System.out.println("a=" + a + " b=" + b);

            if(i==m-1) {
                que.add(a/2);
                que.add(b);
            }else {
                if (a / (2 * 2) > b) {
                    //System.out.println("a / 2 * 2 :" + a / (2 * 2));
                    que.add(a / (2 * 2));
                    que.add(b);
                    i++;
                } else {
                    //System.out.println("a / 2  :" + a / 2 );
                    que.add(a / 2);
                    que.add(b / 2);
                    i++;
                }
            }

        }

        long count =0;
        //System.out.println("size:" + que.size());
        int size = que.size();
        for(int i=0;i < size;i++){
            int temp = que.poll();
            //System.out.println("temp =" + temp);
            count += temp;
        }
        System.out.println(count);




    }
}
class MyComparator implements Comparator {

    public int compare(Object obj1, Object obj2) {

        int num1 = (int)obj1;
        int num2 = (int)obj2;

        if(num1 < num2) {
            return 1;
        } else if(num1 > num2) {
            return -1;
        } else{
            return 0;
        }
    }
}
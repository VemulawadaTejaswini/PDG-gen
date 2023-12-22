import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        comp c = new comp();
        PriorityQueue<Integer> set = new PriorityQueue<>(2000000, c);
        while (!n.equals("end")){
            if(n.equals("insert")){
                int x = scan.nextInt();
                set.add(x);
            }
            else{
                System.out.println(set.poll());
            }
            n = scan.next();
        }
    }
    static class comp implements Comparator<Integer>{
        public int compare(Integer x, Integer y){
            if(x > y){
                return -1;
            }
            else{
                return 1;
            }
        }
    }
}

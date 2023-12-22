import java.util.LinkedList;
import java.util.Scanner;

public class P2 {
    private static Scanner scanner;
    public static void main(String[] args){
        scanner = new Scanner(System.in);
        LinkedList<String> name = new LinkedList<String>();
        LinkedList<Integer> time = new LinkedList<Integer>();
        int length = scanner.nextInt();
        int q = scanner.nextInt();
        int qTime = 0;
        
        for(int i = 0;i < length;i++){
            name.add(scanner.next());
            time.add(scanner.nextInt());
        }

        while(!name.isEmpty()){
            if(time.peek() <= q){
                System.out.print(name.poll() + " ");
                qTime = qTime + time.poll();
                System.out.println(qTime);
            }else{
                name.add(name.poll());
                time.add(time.poll() - q);
                qTime = qTime + q;
            }
        }
    }

}
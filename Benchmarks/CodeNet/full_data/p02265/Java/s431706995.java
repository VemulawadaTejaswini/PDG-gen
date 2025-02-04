import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();									//入力数
        Deque<Integer> num = new ArrayDeque<Integer>();	//トレイ
        //入力の処理
        for(int i = 0; i < n; i++) {
            String s = scan.next();
            if(s.equals("insert")) {
                num.push(Integer.parseInt(scan.next()));
            }else if(s.equals("delete")) {
                int key = Integer.parseInt(scan.next());
                num.remove(key);
            }else if(s.equals("deleteFirst")) {
                num.removeFirst();
            }else if(s.equals("deleteLast")) {
                num.removeLast();
            }
        }

        scan.close();

       int t = num.getFirst();
        int k = num.size() - 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < k; i++) {
            sb.append(num.poll() + " ");
        }
 
        if(num.size() != 0) {
            System.out.print(sb.toString());
           System.out.println(num.poll());
 
        }else {
          System.out.println(t);
        
        }
 
    }
}


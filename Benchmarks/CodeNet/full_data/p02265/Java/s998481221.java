import java.util.ArrayDeque;
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> a = new ArrayDeque<>();
 
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            switch(s){
                case "insert":
                    a.push(sc.nextInt());
                    break;
                case "delete":
                    a.remove(sc.nextInt());
                    break;
                case "deleteFirst":
                    a.removeFirst();
                    break;
                case "deleteLast":
                    a.removeLast();
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a.poll());
        for(int i : a){
            sb.append(" ").append(i);
        }
        System.out.println(sb);
    }
}

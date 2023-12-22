import java.util.LinkedList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        LinkedList<Integer> ls = new LinkedList<>();
        String answer = "";
        for(int x = 0; x < n; x++){
            String c = scan.next();
            if(c.equals("insert")){
                int r = scan.nextInt();
                ls.addFirst(r);
            }
            else if(c.equals("delete")){
                int r = scan.nextInt();
                ls.removeFirstOccurrence(r);
            }
            else if(c.equals("deleteFirst")){
                ls.remove();
            }
            else{
                ls.removeLast();
            }
        }
        while(!ls.isEmpty()){
            if(answer.equals(""))
            answer = answer + ls.remove();
            else
                answer = answer + " " + ls.remove();
        }
        System.out.println(answer);
    }
}

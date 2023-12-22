import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<String> train = new LinkedList<>();
        LinkedList<String> out = new LinkedList<>();
        while(sc.hasNext()){
            String str = sc.next();
            switch(str){
                case "0":
                    out.add(train.getLast());
                    train.removeLast();
                    break;
                default:
                    train.add(str);
                    break;
            }
        }
        for(String a : out){
            System.out.printf(a);
        }
    }


}
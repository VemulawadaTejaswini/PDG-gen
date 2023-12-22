import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<Integer>();
        while(sc.hasNext()){
            int a = sc.nextInt();
            String s = sc.next();
            int b = sc.nextInt();
            if(s.contains("?")){
                break;
            }else if(s.contains("+")){
                numList.add(a + b);
            }else if(s.contains("-")){
                numList.add(a - b);
            }else if(s.contains("*")){
                numList.add(a * b);
            }else if(s.contains("/")){
                numList.add(a / b);
            }
        }
        for(int i = 0; i < numList.size(); i++){
            System.out.println(numList.get(i));
        }
    }
}

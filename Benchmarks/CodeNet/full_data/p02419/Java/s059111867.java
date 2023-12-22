import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String item = sc.next();
        String target = sc.next();
        
        int count = 0;
        for (int i = 0; i<target.length(); i++) {
            int index = target.indexOf(item, i);
            if(i==index){
                count++;
            }
        }
        System.out.println(count);
    }

}

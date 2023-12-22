import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        while(true) {
            String line = sc.nextLine();
            if(line.equals("0")) {
                break;
            }
            list.add(line);
        }
        
        for(int i = 0; i < list.size(); i++) {
            int sum = 0;
            for(int j = 0; j < list.get(i).length(); j++) {
                String str = String.valueOf(list.get(i).charAt(j));
                sum += Integer.parseInt(str);
            }
            System.out.println(sum);
        }
    }
 }

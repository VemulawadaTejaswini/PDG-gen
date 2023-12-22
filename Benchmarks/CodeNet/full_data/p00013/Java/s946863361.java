import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(true) {
            String line;
            try {
                line = sc.nextLine();
            }catch(Exception e){
                break;
            }
            int n = Integer.parseInt(line);
            if(n == 0) {
                System.out.println(list.get(list.size()-1));
                list.remove(list.size()-1);
            }else {
                list.add(n);
            }
        }    
    }
}


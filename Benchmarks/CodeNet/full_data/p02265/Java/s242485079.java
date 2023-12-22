import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int commandNum = Integer.parseInt(s.nextLine());
        List<Integer> array = new LinkedList<Integer>();
        for(int i = 0; i < commandNum; i++){
            //System.out.println(i);
            String[] line = s.nextLine().split(" ");
            switch (line[0]){
            case "insert":
                array.add(0, Integer.parseInt(line[1]));
                break;
            case "delete":
                int target =  Integer.parseInt(line[1]);
                for(int j = 0; j < array.size(); j++){
                    if (array.get(j) == target){
                        array.remove(j);
                        break;
                    }
                }
                break;
            case "deleteFirst":
                array.remove(0);
                break;
            case "deleteLast":
                array.remove(array.size() - 1);
                break;
            }
        }
        for (int j = 0; j < array.size(); ++j) {
            if (j > 0) System.out.print(" ");
            System.out.print(array.get(j));
        }
        System.out.println("");
        s.close();
    }
}
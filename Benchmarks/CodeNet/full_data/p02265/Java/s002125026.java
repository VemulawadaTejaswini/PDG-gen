import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int commandNum = Integer.parseInt(s.nextLine());
        String[] cs = new String[commandNum];
        int[] ns = new int[commandNum];
        String[] elems;
        for (int i = 0; i < commandNum; i++) {
          elems = s.nextLine().split(" ");
          cs[i] = elems[0];
          if (cs[i].equals("insert") || cs[i].equals("delete"))
            ns[i] = Integer.parseInt(elems[1]);
        }
        List<Integer> array = new LinkedList<Integer>();
        int last = 0;
        for(int i = 0; i < commandNum; i++){
            //System.out.println(i);
            switch (cs[i]){
            case "insert":
                array.add(0, ns[last++]);
                break;
            case "delete":
                int target =  ns[last++];
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
        StringBuilder result = new StringBuilder();
        for(int num : array){
            result.append(Integer.toString(num) + " ");
        }
        result.deleteCharAt(result.length()-1);
        System.out.println(result);
        s.close();
    }
}
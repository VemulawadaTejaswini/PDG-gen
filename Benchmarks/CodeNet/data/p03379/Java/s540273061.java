import java.util.*;

public class Main {

    public static  void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < n; i++){
            array.add(scanner.nextInt());
        }
        //System.out.println(array);

        for(int i = 0; i < n; i++){
            ArrayList<Integer> temp = (ArrayList<Integer>) array.clone();
            temp.remove(i);
            Collections.sort(temp);
            //System.out.println(temp);
            System.out.println(temp.get(temp.size()/2));
        }
    }
}

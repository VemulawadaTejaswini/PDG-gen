import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class ListOfTopHills{
    public static void main(int[] args) {
            List<Integer> list = new ArrayList<Integer>();
            for(int str : args){
                list.add(str);
            }
            Collections.sort(list);
            System.out.println(list.get(7));
            System.out.println(list.get(8));
            System.out.println(list.get(9));
    }
}

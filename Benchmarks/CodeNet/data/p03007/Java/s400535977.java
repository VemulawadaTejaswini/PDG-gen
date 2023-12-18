import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(scanner.nextInt());
        }
        while (true){
            if(list.size()==1){
                break;
            }
            function(list);
        }
        System.out.println(list.get(0));
    }
    static void function(List<Integer> list){
        Collections.sort(list);
        int temp;
        if(list.size()==2){
            temp = list.get(1) - list.get(0);

        }else {
             temp = list.get(0) - list.get(1);
        }
        System.out.println(list.get(0)+" "+list.get(1));
        list.remove(1);
        list.remove(0);
        list.add(temp);
    }
}

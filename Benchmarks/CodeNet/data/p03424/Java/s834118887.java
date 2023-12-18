import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<String>();

        for(int i = 0;i<n;i++){
            list.add(sc.next());
        }

        List<String> list2 = new ArrayList<String>(new HashSet<>(list));

        if(list2.size()==3){
            System.out.println("Three");
        }else{
            System.out.println("Four");
        }

    }
}


import java.util.*;


class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        List num = new ArrayList();
        for (int i = 0; i < 9; i++) {
            num.add(s.nextInt());
        }
        int n = s.nextInt();
        List called = new ArrayList();
        for (int i = 0; i < n; i++) {
            called.add(s.nextInt());
        }
        List<List<Integer>> hoge = Arrays.asList(
                Arrays.asList(1, 4, 7),
                Arrays.asList(2, 4),
                Arrays.asList(4, 3, 8),
                Arrays.asList(5, 1),
                Arrays.asList(5, 2, 7, 8),
                Arrays.asList(5, 3),
                Arrays.asList(6, 1, 8),
                Arrays.asList(6, 2),
                Arrays.asList(6, 3,7)
        );
        int[] result=new int[9];
        for (int i = 0; i <called.size() ; i++) {
            if(num.indexOf(called.get(i))!=-1){
                int id=num.indexOf(called.get(i));
                hoge.get(id).forEach((nn)->{
                   result[nn-1]++;
                });
            }
        }
        for (int i = 0; i <9 ; i++) {
            if(result[i]>=3){
                System.out.println("Yes");
                return;
            }

        }
        System.out.println("No");


    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        ArrayList list = new ArrayList();
        while(sc.hasNext()){
            list.add(sc.nextInt());
        }
        System.out.println(calculateAnswer(length,list));
    }
    private static int calculateAnswer(int length,ArrayList<Integer> list){
        ArrayList newlist = new ArrayList<Integer>();
        int result = 0;
        for(int i = 1;i<=length;i++){
            newlist.add((list.get(i-1))-i);
        }
        Integer[] nums = (Integer[])newlist.toArray();
        Arrays.sort(nums);
        int b = nums[length/2];
        for(int i = 1;i<=length;i++){
            result += Math.abs(list.get(i-1)-(b+i));
        }
        return result;
    }
}
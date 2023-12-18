import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        int len = sc.nextInt();

        for(int i = 0; i < len; i++){
            nums.add(sc.nextInt());
        }

        int color = 0;
        while(true){
            int size = nums.size();
            if(size == 0)break;
            int num = nums.get(size-1);
            nums.remove(size-1);
            for(int i = size-2; i >= 0; i--){
                if(nums.get(i) < num){
                    num = nums.get(i);
                    nums.remove(i);
                }
            }
            color++;
        }
        System.out.println(color);
    }
}
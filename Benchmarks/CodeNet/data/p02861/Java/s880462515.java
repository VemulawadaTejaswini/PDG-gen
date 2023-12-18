import java.util.*;

/**
 * @Author: Harry
 * @Date: 2019-11-16
 * @Version 1.0
 */
public class Main {

    static int arr[],t,n,arr2[];

    static int x[],y[];


    static int ans = 0;

    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while(input.hasNext()){
            n = input.nextInt();

            x = new int[n];
            y = new int[n];
            arr = new int[n];

            for(int i = 0;i < n;i++){
                arr[i] = i;
            }

            for(int i = 0;i < n;i++){
                x[i] = input.nextInt();
                y[i] = input.nextInt();
            }

            List<List<Integer>> list = permute(arr);

            double sum = 0;
            for(List<Integer> l : list){
                for(int i = 1;i < l.size();i++){
                    int pre = l.get(i - 1);
                    int now = l.get(i);

                    sum += distance(x[pre],y[pre],x[now],y[now]);
                }
            }

            sum = sum / (list.size() * 1.0);

            System.out.println(sum);
        }



    }

    public  static double distance(int x1,int y1,int x2,int y2){
        double x = (x1 - x2) * (x1 - x2);
        double y = (y1 - y2) * (y1 - y2);

        double ans = x + y;

        ans = Math.sqrt(ans);
        return ans;
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        dfs(list,nums,0);

        return list;
    }


    public static void dfs(List<List<Integer>> list,int[] nums,int idx){

        if(idx == nums.length){
            add(list,nums);
        }

        for(int i = idx;i < nums.length;i++){
             int tp = nums[i];
             nums[i] = nums[idx];
             nums[idx] = tp;
//            Collections.swap(nums, i, idx);


            dfs(list,nums,idx + 1);

             tp = nums[i];
             nums[i] = nums[idx];
             nums[idx] = tp;
//            Collections.swap(nums, i, idx);
        }
    }


    public static void add(List<List<Integer>> list,int[] nums){
        List<Integer> tp = new ArrayList<>();

        for(int i : nums){
            tp.add(i);
        }

        list.add(tp);
    }

















}
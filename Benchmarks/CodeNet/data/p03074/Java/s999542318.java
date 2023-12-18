import java.io.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] sl = str.split(" ");
        int N = Integer.parseInt(sl[0]);
        int K = Integer.parseInt(sl[1]);
        str = br.readLine();
        ArrayList<Integer> nums = new ArrayList<>();
        int tmp = 1;
        int cont = 0;
        for (String s:str.split("")){
            if (Integer.parseInt(s)== tmp){
                cont++;
            } else {
                nums.add(cont);
                cont = 1;
                tmp = 1 - tmp;
            }
        }
        if (cont != 0){
            nums.add(cont);
        }
        if (nums.size() % 2 == 0){
            nums.add(0);
        }
        Integer[] nums_ = nums.toArray(new Integer[nums.size()]);
        int ans = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int k = K * 2 + 1;
        for (int i=0;i<nums_.length;i+=2){
            for (int j=i;j<Math.min(i+k,nums_.length);j++){
                ans += nums_[j];
            }
            list.add(ans);
            ans = 0;
        }
        for (int i:list){
            if (ans < i){
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
import java.util.Scanner;

public class Method {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        //获得n
        String[] sp = new String[n];
        int[] in = new int[n];
        //以空格为分割划分到一个string数组里面
        int count = 0;
        sp = scan.nextLine().split(" ");
        for(int i = 0; i < n; i ++){
            //转换到int数组里面
            in[i] = Integer.parseInt(sp[i]);
        }
        for(int i = 0; i < n - 1; i ++){
            for(int j = i + 1; j < n; j ++){
                if(j - i == in[j] + in[i])
                    count ++;
            }
        }
        System.out.print(count);
    }
}

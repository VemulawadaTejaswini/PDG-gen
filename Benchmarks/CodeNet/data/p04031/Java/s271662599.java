import java.util.*;

public class Main {

    public static int sum(int n){
        return (1+n)*n/2;
    }

    public static String conv(String in){
        ArrayList<String> list
            = new ArrayList<String>();

        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == 'B') {
                if (!list.isEmpty()) {
                    list.remove(list.size() - 1);
                }
            } else {
                list.add(""+in.charAt(i));
            }
        }

        String result = "";
        for (String s : list) {
            result += s;
        }

        return result;
    }
    
    public static int getMinCost (int[] in) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int a : in) {
            if(max < a) {max = a;}
            if(a < min){min = a;}
            sum += a;
        }
        
        int ave = (int)(sum / in.length + 0.5);
        int ave2 = (int)((max + min) / 2 + 0.5);

        int cost = 0;
        int cost2 = 0;
        for (int a : in) {
            cost += (a - ave)*(a - ave);
            cost2 += (a - ave2)*(a - ave2);
        }
        return cost < cost2 ? cost : cost2;
    }

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();

        int[] in = new int[n];

        for (int i = 0; i < in.length; i++) {
            in[i] = sc.nextInt();
        }
        System.out.println(getMinCost(in));
	}
}

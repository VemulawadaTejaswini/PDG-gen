import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        char[][] s = new char[n][];
        int[][] count = new int[n][4];
        int sum = 0;
        int sum2 = 0;
        for(int i=0;i<n;i++){
            s[i] = sc.next().toCharArray();
            count[i][2] = i;
            for(int j=0;j<s[i].length;j++){
                if(s[i][j]=='('){
                    count[i][0]++;
                    sum++;
                }else{
                    if(count[i][0] > 0){
                        count[i][0]--;
                    }else{
                        count[i][1]++;
                    }
                    sum2++;
                }
            }
            if(count[i][0] > 0 && count[i][1] > 0){
                count[i][3] = 2;
            }else if(count[i][0] > 0){
                count[i][3] = 1;
            }else if(count[i][1] > 0){
                count[i][3] = 3;
            }else{
                count[i][3] = 4;
            }

        }
        sc.close();
        if(sum!=sum2){
            System.out.println("No");
            return;
        }
        Arrays.sort(count,new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[3] - o2[3];
			}
        });
        sum = 0;
        for(int i=0;i<n;i++){
            int idx = count[i][2];
            for(int j=0;j<s[idx].length;j++){
                if(s[idx][j]=='('){
                    sum++;
                }else{
                    sum--;
                }
                if(sum<0){
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");


    }
    
}
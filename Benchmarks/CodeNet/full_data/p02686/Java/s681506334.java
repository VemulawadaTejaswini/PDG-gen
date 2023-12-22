import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        char[][] s = new char[n][];
        int[][] count = new int[n][3];
        int sum = 0;
        int sum2 = 0;
        boolean flag ;
        for(int i=0;i<n;i++){
            s[i] = sc.next().toCharArray();
            count[i][2] = i;
            flag = true;
            for(int j=0;j<s[i].length;j++){
                if(s[i][j]=='('){
                    if(flag)count[i][0]++;
                    count[i][1]++;
                    sum++;
                }else{
                    flag = false;
                    count[i][1]--;
                    sum2++;
                }
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
				if(o1[0]==o2[0]){
                    return o2[1]-o1[1];
                }else{
                    return o2[0]-o1[0];
                }
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
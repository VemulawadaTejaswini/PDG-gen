import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int[] ary = new int[n];
        for(int i = 0; i < n; i++)  ary[i] = Integer.parseInt(line1[i]);
        Arrays.sort(ary);
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(ary[i] < ary[j] + ary[k] && ary[j] < ary[i] + ary[k] && ary[k] < ary[i] + ary[j])    count++;
                    else    break;
                }
            }
        }
        System.out.println(count);
    }
}
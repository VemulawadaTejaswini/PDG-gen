import java.util.*;

public class Main{
	public static void main(String[] args){
        
  		Scanner sc = new Scanner(System.in);
        
        String[] line = sc.nextLine().split(" ");
        int length = Integer.parseInt(line[0]);
        double maxItemNum = Double.parseDouble(line[1]);
        
        String[] tempArr = sc.nextLine().split(" ");
        double[] arr = new double[length];

        for(int i = 0;i < length;i++){
            arr[i] = Double.parseDouble(tempArr[i]);
        }

        Arrays.sort(arr);

        int index = 0;
        int result = 0;
        while(index < length) {

          	if (maxItemNum >= arr[index]){
                maxItemNum -= arr[index];
                result++;
            }else{
                break;
            }

            index++;
        }

        System.out.println(result);
    }

}
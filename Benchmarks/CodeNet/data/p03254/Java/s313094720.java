import java.util.*;

public class Main{
	public static void main(String[] args){
        
  		Scanner sc = new Scanner(System.in);
        
        String[] line = sc.nextLine().split(" ");
        int length = Integer.parseInt(line[0]);
        int maxItemNum = Integer.parseInt(line[1]);
        
        String[] tempArr = sc.nextLine().split(" ");
        int[] arr = new int[tempArr.length];

        for(int i = 0;i < arr.length;i++){
            arr[i] = Integer.parseInt(tempArr[i]);
        }

        Arrays.sort(arr);

        int index = 0;
        int result = 0;
        while(index < arr.length) {

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
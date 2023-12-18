import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[] = new int[N];

    for(int i = 0; i < N; i++){
      a[i]= sc.nextInt();
    }

    sortDesc(a);

    int pointA = 0;
    int pointB = 0;

    for(int j = 0; j < N; j++){
      if(j % 2 == 0){
        pointA += a[j];
      }else{
        pointB += a[j];
      }
    }

    int ans = pointA - pointB;
    System.out.println(ans);

  }

  private static void sortDesc(int[] nums) {

        Arrays.sort(nums);

        int[] numsTemp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            numsTemp[i] = nums[nums.length - 1 - i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = numsTemp[i];
        }

    }
}
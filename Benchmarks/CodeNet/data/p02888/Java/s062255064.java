import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];

    for(int i=0; i<n; i++){
      nums[i] = sc.nextInt();
    }

    int cnt = 0;

    for(int i=0; i<n-2; i++){
      for(int j=0; j<n-1; j++){
        for(int k=0; j<n; k++){
          if(nums[i]<nums[j]+nums[k] && nums[j]<nums[i]+nums[k] && nums[k]<nums[i]+nums[j]){
            cnt++;
          }
        }
      }
    }
    System.out.println(cnt);
  }
}

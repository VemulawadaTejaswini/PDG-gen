import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int[] nums = new int[N];

    for (int i = 0; i < N; i++) {
      nums[i] = in.nextInt();
    }

    Arrays.sort(nums);

    int[] arr = new int[N];
    int minIndex = 0;
    int maxIndex = N - 1;

    int index = N / 2;
    int maxIndex1 = index - 1;
    int maxIndex2 = index + 1;
    int minIndex1 = index - 2;
    int minIndex2 = index + 2;

    arr[index] = nums[minIndex];
    minIndex++;

    while (
      0 <= maxIndex1 ||
      0 <= minIndex1 ||
      maxIndex2 < N ||
      minIndex2 < N) {
        if (0 <= maxIndex1) {
          arr[maxIndex1] = nums[maxIndex];
          maxIndex--;
          maxIndex1 -= 2;
        }
        if (maxIndex2 < N) {
          arr[maxIndex2] = nums[maxIndex];
          maxIndex--;
          maxIndex2 += 2;
        }
        if (0 <= minIndex1) {
          arr[minIndex1] = nums[minIndex];
          minIndex++;
          minIndex1 -= 2;
        }
        if (minIndex2 < N) {
          arr[minIndex2] = nums[minIndex];
          minIndex++;
          minIndex2 += 2;
        }
      }

    long ans = 0;

    for (int i = 1; i < N; i++) {
      ans += Math.abs(arr[i] - arr[i - 1]);
    }

    System.out.println(ans);
  }
}
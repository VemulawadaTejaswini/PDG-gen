import java.util.*;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int[] odd;
      int[] even = new int[n / 2];

      if (n % 2 == 0) {
         odd = new int[n / 2];
      } else {
         odd = new int[n / 2 + 1];
      }

      for (int i = 0; i < n / 2; i++) {
         odd[i] = sc.nextInt();
         even[i] = sc.nextInt();
         if (n % 2 == 1 && i == n - 1)
            odd[i+1] = sc.nextInt();
      }

      Arrays.sort(odd);
      Arrays.sort(even);

      int[] oddCount = new int[n];
      oddCount[0] = 1;
      int oddNum = 0;
      for (int i = 1; i < odd.length; i++) {
         if (odd[i] == odd[i - 1]) {
            oddCount[oddNum]++;
         } else {
            oddCount[++oddNum]++;
         }
      }

      int[] evenCount = new int[n];
      evenCount[0] = 1;
      int evenNum = 0;
      for (int i = 1; i < even.length; i++) {
         if (even[i] == even[i - 1]) {
            evenCount[evenNum]++;
         } else {
            evenCount[++evenNum]++;
         }
      }

      Arrays.sort(oddCount);
      Arrays.sort(evenCount);

      if (oddCount[n - 1] == evenCount[n - 1])
         System.out.println(n / 2);
      else
         System.out.println(odd.length - oddCount[n - 1] + even.length - evenCount[n - 1]);
   }
}

import java.util.*;

class InsertionSort{
    public static void main(String[] args){
        // read the input
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int[] numbers = new int[length];

        // copy numbers into our list
        int index = 0;
        while(sc.hasNextInt())
            numbers[index] = sc.nextInt();

        int j;
        for (int i = 1; i < length-1; i++) {
            int key = numbers[i];

            j = i -1;

            while (j >= 0 && numbers[i] > key){
                numbers[j+1] = numbers[j];
                j--;
            }

            numbers[j+1] = key;
            StringBuilder ans = new StringBuilder().append(numbers[0]);

            for (int x = 1; x < length-1; x++)
                 ans.append(" ").append(numbers[x]);

            System.out.println(ans.toString());
        }

    }
}

import java.util.Scanner;

public class Main{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        int n = scanner.nextInt();
        int maxNum = powInt(3, n);
        int[] array = new int[n];
        for(int i = 0; i < n; ++i){
            array[i] = scanner.nextInt();
        }

        int ans = 0;
        for(int i = 0; i < maxNum; ++i){
            int[] ternary = getTernary(i, n);
            int[] arrayB = getArrayB(array, ternary, n);

            ans += (hasEven(arrayB))? 1 : 0;
        }

        System.out.println(ans);
        // int[] arrTest = getTernary(73, n);
        // System.out.print("[");
        // for(int i = n - 1; i >= 0; --i){
        //     System.out.print(" " + arrTest[i]);
        // }
        // System.out.println(" ]");

    }

    public static int powInt(int a, int x){
        int res = 1;
        for(int i = 0; i < x; ++i){
            res *= a;
        }
        return res;
    }

    public static int[] getTernary(int decimal, int arraySize){
        int[] res = new int[arraySize];
        for(int i = 0; i < arraySize; ++i){
            res[i] = decimal % 3;
            decimal /= 3;
        }
        return res;
    }

    public static int[] getArrayB(int[] array, int[] ternary, int arraySize){
        int[] res = new int[arraySize];
        for(int i = 0; i < arraySize; ++i){
            res[i] = array[i];
            res[i] += (ternary[i] == 0)? -1 : (ternary[i] == 1)? 0 : 1;
        }
        return res;
    }

    public static boolean hasEven(int[] array){
        for(int num : array){
            if(num % 2 == 0){
                return true;
            }
        }
        return false;
    }
}
import java.util.*;

public class Main {
    static char[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = sc.next().toCharArray();
        System.out.println(getLength(0, arr.length - 1));
    }
    
    static int getLength(int left, int right) {
        if (arr[left] == 'i' || arr[right] == 'i') {
            return 3;
        }
        if (arr[left] == '(') {
            if (arr[right] == ')') {
                return getLength(left + 1, right - 1) + 2;
            }
        } else if (arr[left] == '{') {
            if (arr[right] == '}') {
                return getLength(left + 1, right - 1) + 2;
            }
        } else if (arr[left] == '[') {
            if (arr[right] == ']') {
                return getLength(left + 1, right - 1) + 2;
            }
        } else if (arr[left] == ')') {
            if (arr[right] == '(') {
                return getLength(left + 1, right - 1) + 2;
            }
        } else if (arr[left] == '}') {
            if (arr[right] == '{') {
                return getLength(left + 1, right - 1) + 2;
            }
        } else if (arr[left] == ']') {
            if (arr[right] == '[') {
                return getLength(left + 1, right - 1) + 2;
            }
        }
        return Math.max(getLength(left + 1, right), getLength(left, right - 1));
    }
    
}

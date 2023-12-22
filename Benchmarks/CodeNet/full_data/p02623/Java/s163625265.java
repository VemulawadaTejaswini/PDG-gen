import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long[] bookStackOne = new long[n];
        int m = input.nextInt();
        long[] bookStackTwo = new long[m];
        long k = input.nextLong();
        for(int i = 0; i < n; i ++) {
            bookStackOne[i] = input.nextLong();
        }
        for(int i = 0; i < m; i ++) {
            bookStackTwo[i] = input.nextLong();
        }
        int positionOne = 0;
        int positionTwo = 0;
        int book = 0;
        while(true) {
            if(positionOne >= n && positionTwo >= m) {
                break;
            }
            if(positionOne < n && positionTwo < m) {
                if(bookStackOne[positionOne] < bookStackTwo[positionTwo]) {
                    if(k - bookStackOne[positionOne] >= 0) {
                        k -= bookStackOne[positionOne];
                        positionOne ++;
                    }
                    else {
                        break;
                    }
                }
                else {
                    if(k - bookStackTwo[positionTwo] >= 0) {
                        k -= bookStackTwo[positionTwo];
                        positionTwo ++;
                    }
                    else {
                        break;
                    }
                }
                book ++;
            }
            else if(positionOne >= n) {
                if(k - bookStackTwo[positionTwo] >= 0) {
                    k -= bookStackTwo[positionTwo];
                    positionTwo ++;
                }
                else {
                    break;
                }
                book ++;
            }
            else {
                if(k - bookStackOne[positionOne] >= 0) {
                    k -= bookStackOne[positionOne];
                    positionOne ++;
                }
                else {
                    break;
                }
                book ++;
            }
        }
        System.out.println(book);
    }

}
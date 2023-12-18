import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n / 2];
        int[] b = new int[n / 2]; 
        for (int i = 0; i < n /2; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int aMaxcount = 1;
        int aSecondCount = 1;
        int amaxnum = 0;
        int amaxNum2 = 0;
        int acount = 1;
        for (int i = 0; i < n / 2 - 1; i++) {
            if (a[i] == a[i + 1]) {
                acount++;
                if (acount > aMaxcount) {
                    aMaxcount = acount;
                    amaxnum = i;
                }

            } else {
                acount = 1;
            }
        }
        for (int i = 0; i < n / 2 - 1; i++) {
            if (a[i] == a[amaxnum]) {
                acount = 1;
                break;
            }
            if (a[i] == a[i + 1]) {
                acount++;
                if (acount > aSecondCount) {
                    aSecondCount = acount;
                    amaxnum = i;
                }

            } else {
                acount = 1;
            }

        }

        int bMaxcount = 1;
        int bSecondCount = 1;
        int bmaxnum = 0;
        int bmaxNum2 = 0;
        int bcount = 1;
        for (int i = 0; i < n / 2 - 1; i++) {
            if (b[i] == b[i + 1]) {
                bcount++;
                if (bcount > bMaxcount) {
                    bMaxcount = bcount;
                    bmaxnum = i;
                }

            } else {
                bcount = 1;
            }
        }
        for (int i = 0; i < n / 2 - 1; i++) {
            if (b[i] == b[amaxnum]) {
                bcount = 1;
                break;
            }
            if (a[i] == a[i + 1]) {
                bcount++;
                if (bcount > bSecondCount) {
                    bSecondCount = bcount;
                    bmaxnum = i;
                }

            } else {
                bcount = 1;
            }

        }
        int ans = 0;
        if (a[amaxnum] != b[bmaxnum]) {
            ans = n - aMaxcount - bMaxcount;
        } else if(aMaxcount == n / 2){
            ans = n / 2;
        }else{
            if (aMaxcount > bMaxcount) {
                
                ans = n - aMaxcount - bSecondCount;
            } else {
                ans = n - aSecondCount - bMaxcount;
            }
        }
        System.out.println(ans);
    }
}
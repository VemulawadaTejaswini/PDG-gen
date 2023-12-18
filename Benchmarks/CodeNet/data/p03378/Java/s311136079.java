import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
sc.nextInt();
int m = sc.nextInt();
int x = sc.nextInt();
int leftFeeAreaCnt = 0;
int rightFeeAreaCnt = 0;
for (int i = 0; i < m; i++) {
int feeArea = sc.nextInt();
if (feeArea < x) {
leftFeeAreaCnt++;
} else if (x < feeArea) {
rightFeeAreaCnt++;
}
}
if (leftFeeAreaCnt <= rightFeeAreaCnt) {
System.out.println(leftFeeAreaCnt);
} else {
System.out.println(rightFeeAreaCnt);
}
}
}